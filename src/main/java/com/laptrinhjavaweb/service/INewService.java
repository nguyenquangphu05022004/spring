package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageable;

import java.util.List;

public interface INewService {
    List<NewModel> findAll(Pageable pageable);
    int getTotalItem();
}
