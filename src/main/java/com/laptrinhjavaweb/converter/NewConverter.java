package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    public NewDTO toDto(NewEntity entity) {
        NewDTO result = new NewDTO();
        result.setTitle(entity.getTitle());
        result.setShortDescription(entity.getShortDescription());
        result.setCategoryCode(entity.getCategory().getCode());
        result.setCategoryId(entity.getCategory().getId());
        result.setThumbnail(entity.getThumbnail());
        result.setContent(entity.getContent());
        result.setId(entity.getId());
        return result;
    }
    public NewEntity toEntity(NewDTO newDTO) {
        NewEntity result = new NewEntity();
        result.setTitle(newDTO.getTitle());
        result.setShortDescription(newDTO.getShortDescription());
        result.setThumbnail(newDTO.getThumbnail());
        result.setContent(newDTO.getContent());
        return result;
    }
    public NewEntity toEntity(NewEntity oldNew, NewDTO newDTO) {
        oldNew.setTitle(newDTO.getTitle());
        oldNew.setShortDescription(newDTO.getShortDescription());
        oldNew.setThumbnail(newDTO.getThumbnail());
        oldNew.setContent(newDTO.getContent());
        return oldNew;
    }
}
