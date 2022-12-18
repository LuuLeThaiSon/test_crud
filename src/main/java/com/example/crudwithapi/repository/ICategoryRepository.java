package com.example.crudwithapi.repository;

import com.example.crudwithapi.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}
