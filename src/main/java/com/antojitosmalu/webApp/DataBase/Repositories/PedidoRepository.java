package com.antojitosmalu.webApp.DataBase.Repositories;

import java.util.List;

import com.antojitosmalu.webApp.Domain.Repositories.OrderRepo;
import com.antojitosmalu.webApp.DataBase.CRUD.PedidoCrudX;
import com.antojitosmalu.webApp.DataBase.Entities.DetallesPedido;
import com.antojitosmalu.webApp.DataBase.Entities.Pedido;
import com.antojitosmalu.webApp.DataBase.Mappers.OrderDetailsMapper;
import com.antojitosmalu.webApp.DataBase.Mappers.OrderMapper;
import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;

public class PedidoRepository implements OrderRepo{

  private PedidoCrudX pedidoCrudX;
  private OrderMapper mapper;
  private OrderDetailsMapper orderDetailsMapper;

  @Override
  public List<OrderDTO> getAll(){
    List<Pedido> orders = (List<Pedido>) pedidoCrudX.findAll();
    return mapper.toOrderDTOs(orders);
  }

  @Override
  public OrderDTO getById(Integer id){
    Pedido pedido = pedidoCrudX.findById(id).orElse(null);
    return mapper.toOrderDTO(pedido);
  }

  @Override
  public OrderDTO save(OrderDTO entity){
    Pedido pedido = mapper.toPedido(entity);
    pedidoCrudX.save(pedido);
    return mapper.toOrderDTO(pedido);
  }

  @Override
  public OrderDTO update(OrderDTO entity){
    Pedido pedido = mapper.toPedido(entity);
    pedidoCrudX.save(pedido);
    return mapper.toOrderDTO(pedido);
  }

  @Override
  public void delete(Integer id){
    pedidoCrudX.deleteById(id);
  }

  @Override
  public List<OrderDTO> getByClientId(Integer clientId){
    List<Pedido> orders = pedidoCrudX.findByClienteIdCliente(clientId);
    return mapper.toOrderDTOs(orders);
  }

  @Override
  public List<OrderDTO> getByStatus(String status){
    List<Pedido> orders = pedidoCrudX.findByEstado(status);
    return mapper.toOrderDTOs(orders);
  }

  @Override
  public List<OrderDTO> getByDate(String date){
    List<Pedido> orders = pedidoCrudX.findByFechaPedido(date);
    return mapper.toOrderDTOs(orders);
  }

  @Override
  public List<OrderDetailsDTO> getOrderDetails(Integer orderId){
    List<DetallesPedido> orderDetails = pedidoCrudX.findDetallesPedidoByIdPedido(orderId);
    return orderDetailsMapper.toOrderDetailsDTOs(orderDetails);
  }

  @Override
  public OrderDTO cancel(Integer id){
    Pedido pedido = pedidoCrudX.findById(id).orElse(null);
    pedido.setEstado("Cancelado");
    pedidoCrudX.save(pedido);
    return mapper.toOrderDTO(pedido);
  }
}
