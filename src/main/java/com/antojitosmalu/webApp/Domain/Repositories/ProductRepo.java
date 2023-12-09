package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;

import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;

public interface ProductRepo extends GlobalRepo<ProductDTO> {
  List<ProductDTO> getByCategoryId(Integer category);
}
