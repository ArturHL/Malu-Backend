package com.antojitosmalu.webApp.Controllers.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;
import com.antojitosmalu.webApp.Domain.Services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @GetMapping("/all")
  public List<ProductDTO> getAll(){
    return productService.getAll();
  }

  @GetMapping("/{id}")
  public ProductDTO getById(@PathVariable("id") Integer id){
    return productService.getById(id);
  }

  @PostMapping("/save")
  public ProductDTO save(@RequestBody ProductDTO ProductDTO){
    return productService.save(ProductDTO);
  }

  @PutMapping("/update")
  public ProductDTO update(@RequestBody ProductDTO ProductDTO){
    return productService.update(ProductDTO);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id){
    productService.delete(id);
  }

  @GetMapping("/byCategory/{categoryId}")
  public List<ProductDTO> getByCategoryId(@PathVariable("categoryId") Integer categoryId){
    return productService.getByCategoryId(categoryId);
  }
}
