package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INewSevice implements INewService {
    @Autowired
    private INewDAO iNewDAO;
    @Override
    public List<NewModel> findAll(Pageable pageable) {
        return iNewDAO.findAll(pageable);
    }

    @Override
    public int getTotalItem() {
        return iNewDAO.getTotalItem();
    }
}
