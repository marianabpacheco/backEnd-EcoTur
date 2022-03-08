package com.dhecotur.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface IDao <T> {

    T save(T t);

    Optional<T> findById(Long id);

    void delete(Long id);

    List<T> findAll();

    T update(T t);
}
