package com.antojitosmalu.webApp.DataBase.Repositories;

import com.antojitosmalu.webApp.Domain.Repositories.ProductRepo;
import com.antojitosmalu.webApp.DataBase.CRUD.ProductoCrudX;
import com.antojitosmalu.webApp.DataBase.Entities.Categoria;
import com.antojitosmalu.webApp.DataBase.Entities.Producto;
import com.antojitosmalu.webApp.DataBase.Mappers.ProductMapper;
import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductoRepository implements ProductRepo{
  @Autowired
  private ProductoCrudX productoCrudX;
  @Autowired
  private ProductMapper mapper;

  @Override
  public List<ProductDTO> getAll(){
    List<Producto> productos = (List<Producto>) productoCrudX.findAll();
    return mapper.toProductDTOs(productos);
  }

  @Override
  public ProductDTO getById(Integer id){
    Producto producto = productoCrudX.findById(id).orElse(null);
    return mapper.toProductDTO(producto);
  }

  @Override
  public ProductDTO save(ProductDTO entity){
    Producto producto = mapper.toProducto(entity);
    productoCrudX.save(producto);
    return mapper.toProductDTO(producto);
  }

  @Override
  public ProductDTO update(ProductDTO entity){
    Producto producto = mapper.toProducto(entity);
    productoCrudX.save(producto);
    return mapper.toProductDTO(producto);
  }

  @Override
  public void delete(Integer id){
    productoCrudX.deleteById(id);
  }

  @Override
  public List<ProductDTO> getByCategory(Categoria category){
    List<Producto> productos = productoCrudX.findByCategoria(category);
    return mapper.toProductDTOs(productos);
  }
}
