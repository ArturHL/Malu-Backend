package com.antojitosmalu.webApp.DataBase.Repositories;

import java.util.List;

import com.antojitosmalu.webApp.DataBase.CRUD.ClienteCrudX;
import com.antojitosmalu.webApp.DataBase.Entities.Cliente;
import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;
import com.antojitosmalu.webApp.Domain.Repositories.ClientRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.antojitosmalu.webApp.DataBase.Mappers.ClientMapper;

@Repository
public class ClienteRepository implements ClientRepo {
  @Autowired
  private ClienteCrudX clienteCrudX;
  @Autowired
  private ClientMapper mapper;

  @Override
  public List<ClientDTO> getAll() {
    List<Cliente> clientes = (List<Cliente>) clienteCrudX.findAll();
    return mapper.toClientsDTO(clientes);
  }

  @Override
  public ClientDTO getById(Integer id) {
    Cliente cliente = clienteCrudX.findById(id).orElse(null);
    return mapper.toClientDTO(cliente);
  }

  @Override
  public ClientDTO save(ClientDTO clientDTO) {
    Cliente cliente = mapper.toCliente(clientDTO);
    cliente = clienteCrudX.save(cliente);
    return mapper.toClientDTO(cliente);
  }

  @Override
  public ClientDTO update(ClientDTO clientDTO) {
    Cliente cliente = mapper.toCliente(clientDTO);
    cliente = clienteCrudX.save(cliente);
    return mapper.toClientDTO(cliente);
  }

  @Override
  public void delete(Integer id) {
    clienteCrudX.deleteById(id);
  }
}
