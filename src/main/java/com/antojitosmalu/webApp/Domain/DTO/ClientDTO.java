package com.antojitosmalu.webApp.Domain.DTO;

import java.util.List;

public class ClientDTO {
  
  // Attributes

  private Integer clientId;

  private String name;

  private String email;

  private String address;

  private String phone;

  private List<OrderDTO> orders;

  private List<ReservationDTO> reservations;

  // Getters and Setters

  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public List<OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  public List<ReservationDTO> getReservations() {
    return reservations;
  }

  public void setReservations(List<ReservationDTO> reservations) {
    this.reservations = reservations;
  }
}