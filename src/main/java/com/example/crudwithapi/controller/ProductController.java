package com.example.crudwithapi.controller;

import com.example.crudwithapi.model.Product;
import com.example.crudwithapi.service.interface_service.ICategoryService;
import com.example.crudwithapi.service.interface_service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ModelAndView list() {
        return new ModelAndView("/index", "products", productService.findAll());
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", productService.findOne(id).get());
        modelAndView.addObject("categories", categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product") Product product, @RequestParam(value = "categoryId", required = false) Long categoryId) {
        product.setCategory(categoryService.findOne(categoryId).get());
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }
}
