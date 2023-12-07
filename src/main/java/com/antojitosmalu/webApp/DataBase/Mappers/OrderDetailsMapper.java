package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;
import com.antojitosmalu.webApp.DataBase.Entities.DetallesPedido;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

public interface OrderDetailsMapper {
  
  @Mappings({
    @Mapping(target = "orderDetailsId", source = "idDetallesPedido"),
    @Mapping(target = "quantity", source = "cantidad"),
    @Mapping(target = "unitPrice", source = "precioUnitario"),
    @Mapping(target = "order", source = "pedido"),
    @Mapping(target = "product", source = "producto")
  })
  OrderDetailsDTO toOrderDetailsDTO(DetallesPedido detallesPedido);

  @InheritInverseConfiguration
  DetallesPedido toDetallesPedido(OrderDetailsDTO orderDetailsDTO);
}
