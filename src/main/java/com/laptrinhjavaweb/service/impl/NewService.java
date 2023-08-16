package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.CategoryRepository;
import com.laptrinhjavaweb.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Service
public class NewService implements com.laptrinhjavaweb.service.NewService {
    @Autowired
    private NewRepository newRepository;
    @Autowired
    private NewConverter newConverter;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<NewDTO> findAll(Pageable pageable) {
        List<NewDTO> newDTOs = new ArrayList<>();
        List<NewEntity> entities = newRepository.findAll(pageable).getContent();
        for (NewEntity newEntity : entities) {
            newDTOs.add(newConverter.toDto(newEntity));
        }
        return newDTOs;
    }

    @Override
    public int getTotalItem() {
        return (int) newRepository.count();
    }

    @Override
    public NewDTO findById(Long id) {
        return newConverter.toDto(newRepository.findOne(id));
    }
    
    @Override
    @Transactional
    public NewDTO save(NewDTO newDTO) {
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        NewEntity entity = new NewEntity();
        if(newDTO.getId() != null) {
            NewEntity oldNew = newRepository.findOne(newDTO.getId());
            oldNew.setCategory(categoryEntity);
            entity = newConverter.toEntity(oldNew, newDTO);
            System.out.println(entity.getCreateDate());
            System.out.println(entity.getModifiedDate().toString());

        } else {
            entity = newConverter.toEntity(newDTO);
            entity.setCategory(categoryEntity);
        }
        return newConverter.toDto(newRepository.save(entity));
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id: ids) {
            newRepository.delete(id);
        }
    }


}