package com.example.crudwithapi.controller;

import com.example.crudwithapi.service.impl.ProductService;
import com.example.crudwithapi.service.interface_service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("/index", "products", productService.findAll());
    }
}
