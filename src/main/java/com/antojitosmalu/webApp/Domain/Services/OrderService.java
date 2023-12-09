package com.antojitosmalu.webApp.Domain.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.antojitosmalu.webApp.Domain.Repositories.OrderRepo;
import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;

import java.util.List;

@Service
public class OrderService {
  @Autowired
  private OrderRepo orderRepo;

  public List<OrderDTO> getAll(){
    return orderRepo.getAll();
  }

  public OrderDTO getById(Integer id){
    return orderRepo.getById(id);
  }

  public OrderDTO save(OrderDTO orderDTO){
    return orderRepo.save(orderDTO);
  }

  public OrderDTO update(OrderDTO orderDTO){
    return orderRepo.update(orderDTO);
  }

  public void delete(Integer id){
    orderRepo.delete(id);
  }

  public List<OrderDTO> getByClientId(Integer clientId){
    return orderRepo.getByClientId(clientId);
  }

  public List<OrderDTO> getByStatus(String status){
    return orderRepo.getByStatus(status);
  }

  public List<OrderDTO> getByDate(String date){
    return orderRepo.getByDate(date);
  }

  public List<OrderDetailsDTO> getOrderDetails(Integer orderId){
    return orderRepo.getOrderDetails(orderId);
  }

  public OrderDTO cancel(Integer id){
    return orderRepo.cancel(id);
  }
}
