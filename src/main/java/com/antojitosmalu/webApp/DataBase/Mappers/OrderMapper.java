package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Pedido;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
  @Mappings({
    @Mapping(target = "orderId", source = "idPedido"),
    @Mapping(target = "orderDate", source = "fechaPedido"),
    @Mapping(target = "status", source = "estado"),
    @Mapping(target = "client", source = "cliente"),
    @Mapping(target = "orderDetails", source = "detallesPedido")
  })
  OrderDTO toOrderDTO(Pedido pedido);
  List<OrderDTO> toOrderDTOs(List<Pedido> pedidos);

  @InheritInverseConfiguration
  Pedido toPedido(OrderDTO orderDTO);
}
