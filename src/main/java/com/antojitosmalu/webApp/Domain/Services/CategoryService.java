package com.antojitosmalu.webApp.Domain.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antojitosmalu.webApp.Domain.DTO.CategoryDTO;
import com.antojitosmalu.webApp.Domain.Repositories.CategoryRepo;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepo categoryRepo;

  public List<CategoryDTO> getAll(){
    return categoryRepo.getAll();
  }

  public CategoryDTO getById(Integer id){
    return categoryRepo.getById(id);
  }

  public CategoryDTO save(CategoryDTO categoryDTO){
    return categoryRepo.save(categoryDTO);
  }

  public CategoryDTO update(CategoryDTO categoryDTO){
    return categoryRepo.update(categoryDTO);
  }

  public void delete(Integer id){
    categoryRepo.delete(id);
  }
}
