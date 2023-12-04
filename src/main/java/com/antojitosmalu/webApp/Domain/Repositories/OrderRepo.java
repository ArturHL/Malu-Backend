package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;

public interface OrderRepo {
  List<OrderDTO> getAll();
  OrderDTO getById(Integer id);
  List<OrderDTO> getByClientId(Integer clientId);
  List<OrderDTO> getByProductId(Integer productId);
  List<OrderDTO> getByStatus(String status);
  List<OrderDTO> getByDate(String date);
  List<OrderDetailsDTO> getOrderDetails(Integer orderId);
  OrderDTO save(OrderDTO orderDTO);
  OrderDTO cancel(Integer id);
  void delete(Integer id);
}
