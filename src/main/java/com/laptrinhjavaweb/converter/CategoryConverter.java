package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {

    public CategoryDTO toDto(CategoryEntity entity) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCode(entity.getCode());
        categoryDTO.setName(entity.getName());
        categoryDTO.setId(entity.getId());
        return categoryDTO;
    }
    public CategoryEntity toEntity(CategoryDTO categoryDTO) {
        CategoryEntity entity = new CategoryEntity();
        entity.setCode(categoryDTO.getCode());
        entity.setName(categoryDTO.getName());
        return entity;
    }
}
