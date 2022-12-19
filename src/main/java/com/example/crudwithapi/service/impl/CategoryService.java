package com.example.crudwithapi.service.impl;

import com.example.crudwithapi.model.Category;
import com.example.crudwithapi.repository.ICategoryRepository;
import com.example.crudwithapi.service.interface_service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findOne(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void save(Category category) {
    }

    @Override
    public void deleteById(Long aLong) {
    }
}
