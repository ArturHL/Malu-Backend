package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;

public interface ProductRepo {
  List<ProductDTO> getAll();
  ProductDTO getById(Integer id);
  List<ProductDTO> getByCategoryId(Integer categoryId);
  ProductDTO save(ProductDTO productDTO);
  void delete(Integer id);
}
