package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.OrderDTO;
import com.antojitosmalu.webApp.Domain.DTO.OrderDetailsDTO;

public interface OrderRepo extends GlobalRepo<OrderDTO>{
  List<OrderDTO> getByClientId(Integer clientId);
  List<OrderDTO> getByStatus(String status);
  List<OrderDTO> getByDate(String date);
  List<OrderDetailsDTO> getOrderDetails(Integer orderId);
  OrderDTO cancel(Integer id);
}
