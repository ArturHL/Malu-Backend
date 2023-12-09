package com.antojitosmalu.webApp.DataBase.CRUD;

import com.antojitosmalu.webApp.DataBase.Entities.Producto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudX extends CrudRepository<Producto, Integer>{
  List<Producto> findByCategoriaIdCategoria(Integer categoria);
}
