package com.example.crudwithapi.service.core;

import java.util.List;
import java.util.Optional;

public interface ICrud<E, K> {
    List<E> findAll();
    Optional<E> findOne(K k);
    void save(E e);
    void deleteById(K k);

}
