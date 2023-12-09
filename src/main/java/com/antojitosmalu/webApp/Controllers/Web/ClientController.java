package com.antojitosmalu.webApp.Controllers.Web;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antojitosmalu.webApp.Domain.DTO.ClientDTO;
import com.antojitosmalu.webApp.Domain.Services.ClientService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/clients")
public class ClientController {
  @Autowired
  private ClientService clientService;

  @GetMapping("/all")
  public List<ClientDTO> getAll(){
    return clientService.getAll();
  }

  @GetMapping("/{id}")
  public ClientDTO getById(@PathVariable("id") Integer id){
    return clientService.getById(id);
  }

  @PostMapping("/save")
  public ClientDTO save(@RequestBody ClientDTO clientDTO){
    return clientService.save(clientDTO);
  }

  @PutMapping("/update")
  public ClientDTO update(@RequestBody ClientDTO clientDTO){
    return clientService.update(clientDTO);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id){
    clientService.delete(id);
  }
}
