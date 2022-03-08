package com.dhecotur.service.impl;

import com.dhecotur.model.Category;
import com.dhecotur.repository.CategoryRepository;
import com.dhecotur.service.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements IDao<Category>{

    @Autowired
    CategoryRepository repository;

    @Override
    public Category save(Category category) { return repository.save(category); }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    @Override
    public Optional<Category> findById(Long id) { return repository.findById(id); }
    @Override
    public List<Category> findAll() { return repository.findAll(); }
    @Override
    public Category update(Category category) {
        return repository.save(category);
    }
}
