package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;
import com.antojitosmalu.webApp.DataBase.Entities.DetallesPedido;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface OrderDetailsMapper {
  
  @Mappings({
    @Mapping(target = "orderDetailsId", source = "idDetallesPedido"),
    @Mapping(target = "quantity", source = "cantidad"),
    @Mapping(target = "unitPrice", source = "precioUnitario"),
    @Mapping(target = "product", source = "producto")
  })
  OrderDetailsDTO toOrderDetailsDTO(DetallesPedido detallesPedido);
  List<OrderDetailsDTO> toOrderDetailsDTOs(List<DetallesPedido> detallesPedidos);

  @InheritInverseConfiguration
  @Mapping(target = "pedido", ignore = true)
  DetallesPedido toDetallesPedido(OrderDetailsDTO orderDetailsDTO);
}
