package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.CategoryDTO;

public interface CategoryRepo {
  List<CategoryDTO> getAll();
  CategoryDTO getById(Integer id);
  CategoryDTO save(CategoryDTO categoryDTO);
  void delete(Integer id);
}
