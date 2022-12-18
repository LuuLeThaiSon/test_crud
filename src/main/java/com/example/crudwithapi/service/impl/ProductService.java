package com.example.crudwithapi.service.impl;

import com.example.crudwithapi.model.Product;
import com.example.crudwithapi.repository.IProductRepository;
import com.example.crudwithapi.service.interface_service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
//    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findOne(Long id) {
        return null;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
