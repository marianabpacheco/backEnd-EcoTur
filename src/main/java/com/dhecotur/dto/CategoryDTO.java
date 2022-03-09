package com.dhecotur.dto;

import com.dhecotur.model.Category;
import lombok.Data;

@Data
public class CategoryDTO {

    private Long id;
    private String title, description, url;

    public static CategoryDTO categoryDTO(Category category) {
        CategoryDTO cat = new CategoryDTO();
        cat.setId(category.getId());
        cat.setTitle(category.getTitle());
        cat.setDescription(category.getDescription());
        cat.setUrl(category.getUrl());
        return cat;
    }
}
