package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Cliente;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
  @Mappings({
    @Mapping(target = "clientId", source = "idCliente"),
    @Mapping(target = "name", source = "nombre"),
    @Mapping(target = "email", source = "email"),
    @Mapping(target = "address", source = "direccion"),
    @Mapping(target = "phone", source = "telefono"),
  })
  ClientDTO toClientDTO(Cliente cliente);
  List<ClientDTO> toClientsDTO(List<Cliente> clientes);

  @InheritInverseConfiguration
  @Mapping(target = "pedidos", ignore = true)
  @Mapping(target = "reservaciones", ignore = true)
  Cliente toCliente(ClientDTO clientDTO);
}
