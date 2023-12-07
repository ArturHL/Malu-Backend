package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;

import com.antojitosmalu.webApp.DataBase.Entities.Categoria;
import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;

public interface ProductRepo extends GlobalRepo<ProductDTO> {
  List<ProductDTO> getByCategory(Categoria category);
}
