package com.antojitosmalu.webApp.Domain.DTO;

import java.util.List;

public class OrderDTO {
  
  // Attributes

  private Integer orderId;

  private String orderDate;

  private String status;

  private ClientDTO client;

  private List<OrderDetailsDTO> orderDetails;

  // Getters and Setters

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ClientDTO getClient() {
    return client;
  }

  public void setClient(ClientDTO client) {
    this.client = client;
  }

  public List<OrderDetailsDTO> getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(List<OrderDetailsDTO> orderDetails) {
    this.orderDetails = orderDetails;
  }
}