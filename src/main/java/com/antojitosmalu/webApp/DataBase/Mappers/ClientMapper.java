package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Cliente;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

public interface ClientMapper {
  @Mappings({
    @Mapping(target = "clientId", source = "idCliente"),
    @Mapping(target = "name", source = "nombre"),
    @Mapping(target = "email", source = "email"),
    @Mapping(target = "address", source = "direccion"),
    @Mapping(target = "phone", source = "telefono"),
    @Mapping(target = "orders", source = "pedidos"),
    @Mapping(target = "reservations", source = "reservaciones")
  })
  ClientDTO toClientDTO(Cliente cliente);

  @InheritInverseConfiguration
  Cliente toCliente(ClientDTO clientDTO);
}
