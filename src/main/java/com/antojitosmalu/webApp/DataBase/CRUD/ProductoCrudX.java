package com.antojitosmalu.webApp.DataBase.CRUD;

import com.antojitosmalu.webApp.DataBase.Entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudX extends CrudRepository<Producto, Integer>{
  
}
