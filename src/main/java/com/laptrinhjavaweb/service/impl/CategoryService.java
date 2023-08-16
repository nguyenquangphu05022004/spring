package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.CategoryConverter;
import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService implements com.laptrinhjavaweb.service.CategoryService {

    @Autowired
    private CategoryConverter categoryConverter;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Map<String, String> findAll() {
        Map<String, String> map = new HashMap<>();
        List<CategoryEntity> entities = categoryRepository.findAll();
        for (CategoryEntity entity: entities) {
            map.put(entity.getCode(), entity.getName());
        }
        return map;
    }
}
