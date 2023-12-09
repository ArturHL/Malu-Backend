package com.antojitosmalu.webApp.Domain.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.antojitosmalu.webApp.Domain.Repositories.ProductRepo;
import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;
import java.util.List;

@Service
public class ProductService {
  @Autowired
  private ProductRepo productRepo;

  public List<ProductDTO> getAll(){
    return productRepo.getAll();
  }

  public ProductDTO getById(Integer id){
    return productRepo.getById(id);
  }

  public ProductDTO save(ProductDTO productDTO){
    return productRepo.save(productDTO);
  }

  public ProductDTO update(ProductDTO productDTO){
    return productRepo.update(productDTO);
  }

  public void delete(Integer id){
    productRepo.delete(id);
  }

  public List<ProductDTO> getByCategoryId(Integer categoryId){
    return productRepo.getByCategoryId(categoryId);
  }
}
