package com.antojitosmalu.webApp.DataBase.CRUD;

import com.antojitosmalu.webApp.DataBase.Entities.Reservacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReservacionCrudX extends CrudRepository<Reservacion, Integer>{
  List<Reservacion> findByClienteIdCliente(Integer idCliente);
}
