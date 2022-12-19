package com.example.crudwithapi.repository;

import com.example.crudwithapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
