package com.antojitosmalu.webApp.DataBase.Repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.antojitosmalu.webApp.DataBase.CRUD.CategoriaCrudX;
import com.antojitosmalu.webApp.DataBase.Entities.Categoria;
import com.antojitosmalu.webApp.DataBase.Mappers.CategoryMapper;
import com.antojitosmalu.webApp.Domain.DTO.CategoryDTO;
import com.antojitosmalu.webApp.Domain.Repositories.CategoryRepo;

@Repository
public class CategoriaRepository implements CategoryRepo{
  private CategoriaCrudX categoriaCrudX;
  private CategoryMapper mapper;

  @Override
  public List<CategoryDTO> getAll() {
    List<Categoria> categories = (List<Categoria>) categoriaCrudX.findAll();
    return mapper.toCategoriesDTO(categories);
  }

  @Override
  public CategoryDTO getById(Integer id) {
    Categoria categoria = categoriaCrudX.findById(id).orElse(null);
    return mapper.toCategoryDTO(categoria);
  }

  @Override
  public CategoryDTO save(CategoryDTO category) {
    Categoria categoria = categoriaCrudX.save(mapper.toCategoria(category));
    return mapper.toCategoryDTO(categoria);
  }

  @Override
  public void delete(Integer id) {
    categoriaCrudX.deleteById(id);
  }
}
