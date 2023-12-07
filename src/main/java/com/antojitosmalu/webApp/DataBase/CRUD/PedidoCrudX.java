package com.antojitosmalu.webApp.DataBase.CRUD;

import com.antojitosmalu.webApp.DataBase.Entities.DetallesPedido;
import com.antojitosmalu.webApp.DataBase.Entities.Pedido;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PedidoCrudX extends CrudRepository<Pedido, Integer>{
  List<Pedido> findByClienteIdCliente(Integer idCliente);

  List<Pedido> findByEstado(String estado);

  List<Pedido> findByFechaPedido(String fechaPedido);

  List<DetallesPedido> findDetallesPedidoByIdPedido(Integer idPedido);

}
