package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.CategoryDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Categoria;
import org.mapstruct.Mappings;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface CategoryMapper {
  @Mappings({
    @Mapping(target = "categoryId", source = "idCategoria"),
    @Mapping(target = "name", source = "nombre"),
    @Mapping(target = "description", source = "descripcion"),
    @Mapping(target = "products", source = "productos")
  })
  CategoryDTO toCategoryDTO(Categoria categoria);
  List<CategoryDTO> toCategoriesDTO(List<Categoria> categoria);

  @InheritInverseConfiguration
  Categoria toCategoria(CategoryDTO categoryDTO);
}
