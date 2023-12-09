package com.antojitosmalu.webApp.Controllers.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.Domain.Services.OrderService;
import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/orders")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @GetMapping("/all")
  public List<OrderDTO> getAll(){
    return orderService.getAll();
  }

  @GetMapping("/{id}")
  public OrderDTO getById(@PathVariable("id") Integer id){
    return orderService.getById(id);
  }

  @PostMapping("/save")
  public OrderDTO save(@RequestBody OrderDTO OrderDTO){
    return orderService.save(OrderDTO);
  }

  @PutMapping("/update")
  public OrderDTO update(@RequestBody OrderDTO OrderDTO){
    return orderService.update(OrderDTO);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id){
    orderService.delete(id);
  }

  @GetMapping("/byClientId/{clientId}")
  public List<OrderDTO> getByClientId(@PathVariable("clientId") Integer clientId){
    return orderService.getByClientId(clientId);
  }

  @GetMapping("/byStatus/{status}")
  public List<OrderDTO> getByStatus(@PathVariable("status") String status){
    return orderService.getByStatus(status);
  }

  @GetMapping("/byDate/{date}")
  public List<OrderDTO> getByDate(@PathVariable("date") String date){
    return orderService.getByDate(date);
  }

  @GetMapping("/details/{orderId}")
  public List<OrderDetailsDTO> getOrderDetails(@PathVariable("orderId") Integer orderId){
    return orderService.getOrderDetails(orderId);
  }

  @PutMapping("/cancel/{id}")
  public OrderDTO cancel(@PathVariable("id") Integer id){
    return orderService.cancel(id);
  }
}
