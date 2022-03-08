package com.dhecotur.dto;

import com.dhecotur.model.Category;
import lombok.Data;

@Data
public class CategoryDTO {

    private Long id;
    private String titulo, descricao, url;

    public static CategoryDTO categoriasDTO(Category category) {
        CategoryDTO cat = new CategoryDTO();
        cat.setId(category.getId());
        cat.setTitulo(category.getTitulo());
        cat.setDescricao(category.getDescricao());
        cat.setUrl(category.getUrl());
        return cat;
    }
}
