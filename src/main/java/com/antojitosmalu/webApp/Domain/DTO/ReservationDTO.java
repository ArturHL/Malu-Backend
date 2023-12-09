package com.antojitosmalu.webApp.Domain.DTO;

public class ReservationDTO {
  
  // Attributes

  private Integer reservationId;

  private String reservationDate;

  private String reservationState;

  private String reservationDetails;

  private ClientDTO client;

  // Getters and Setters

  public Integer getReservationId() {
    return reservationId;
  }

  public void setReservationId(Integer reservationId) {
    this.reservationId = reservationId;
  }

  public String getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(String reservationDate) {
    this.reservationDate = reservationDate;
  }

  public String getReservationState() {
    return reservationState;
  }

  public void setReservationState(String reservationState) {
    this.reservationState = reservationState;
  }

  public String getReservationDetails() {
    return reservationDetails;
  }

  public void setReservationDetails(String reservationDetails) {
    this.reservationDetails = reservationDetails;
  }

  public ClientDTO getClient() {
    return client;
  }

  public void setClient(ClientDTO clientId) {
    this.client = clientId;
  }
}