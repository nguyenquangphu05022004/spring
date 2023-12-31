package com.laptrinhjavaweb.api.admin;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

  @Autowired
  private NewService newService;
  @PostMapping("/api/new")
    public NewDTO createNew(@RequestBody NewDTO newDTO) {
        return newService.save(newDTO);
    }
    @PutMapping("/api/new")
    public NewDTO updateNew(@RequestBody NewDTO updateNew) {
        return newService.save(updateNew);
    }
    @DeleteMapping("/api/new")
    public void delelteNew(@RequestBody Long[] ids) {
        newService.delete(ids);
    }
}
