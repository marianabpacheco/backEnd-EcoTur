package com.dhecotur.controller;

import com.dhecotur.dto.CategoryDTO;
import com.dhecotur.model.Category;
import com.dhecotur.service.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "")
@RequestMapping("/categorias")
public class CategoryController {

    @Autowired
    private IDao<Category> service;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll(){
        return ResponseEntity.ok(
                service.findAll().stream().map( CategoryDTO::categoryDTO).collect(Collectors.toList())
        );
    }

    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) {
        return ResponseEntity.ok(service.save(category));
    }

    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category category) {
        ResponseEntity<Category> response = null;

        if (category.getId() != null && service.findById(category.getId()).isPresent())
            response = ResponseEntity.ok(service.update(category));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Long id) {
        ResponseEntity<String> response = null;

        if (service.findById(id).isPresent()) {
            service.delete(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Apagado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> buscar(@PathVariable Long id) {
        Category category = service.findById(id).orElse(null);
        return ResponseEntity.ok(category);
    }

}
