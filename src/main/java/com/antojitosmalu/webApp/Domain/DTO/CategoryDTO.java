package com.antojitosmalu.webApp.Domain.DTO;

import java.util.List;

public class CategoryDTO {

  // Attributes

  private Integer categoryId;

  private String name;

  private String description;

  private List<ProductDTO> products;

  // Getters and Setters

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<ProductDTO> getProducts() {
    return products;
  }

  public void setProducts(List<ProductDTO> products) {
    this.products = products;
  }
}