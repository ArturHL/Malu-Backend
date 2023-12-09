package com.antojitosmalu.webApp.Domain.Services;

import com.antojitosmalu.webApp.Domain.Repositories.ClientRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;
import java.util.List;

@Service
public class ClientService {
  @Autowired
  private ClientRepo clientRepo;

  public List<ClientDTO> getAll(){
    return clientRepo.getAll();
  }

  public ClientDTO getById(Integer id){
    return clientRepo.getById(id);
  }

  public ClientDTO save(ClientDTO clientDTO){
    return clientRepo.save(clientDTO);
  }

  public ClientDTO update(ClientDTO clientDTO){
    return clientRepo.update(clientDTO);
  }

  public void delete(Integer id){
    clientRepo.delete(id);
  }
}
