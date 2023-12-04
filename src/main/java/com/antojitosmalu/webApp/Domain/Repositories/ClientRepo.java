package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;

public interface ClientRepo {
  List<ClientDTO> getAll();
  ClientDTO getById(Integer id);
  ClientDTO save(ClientDTO clientDTO);
  ClientDTO update(ClientDTO clientDTO);
  void delete(Integer id);
}
