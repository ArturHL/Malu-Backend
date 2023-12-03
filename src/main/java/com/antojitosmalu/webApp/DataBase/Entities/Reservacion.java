package com.antojitosmalu.webApp.DataBase.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "reservaciones")
public class Reservacion {
  
  // Attributes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "reserva_id")
  private Integer idReserva;

  @Column(name = "fecha_reserva")
  private String fechaReserva;

  @Column(name = "estado_reserva")
  private String estadoReserva;

  @Column(name = "detalles_reserva")
  private String detallesReserva;
  
  // Relationships

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;

  // Getters and Setters
  
  public Integer getIdReserva() {
    return idReserva;
  }

  public void setIdReserva(Integer idReserva) {
    this.idReserva = idReserva;
  }

  public Cliente getIdCliente() {
    return cliente;
  }

  public void setIdCliente(Cliente idCliente) {
    this.cliente = idCliente;
  }

  public String getFechaReserva() {
    return fechaReserva;
  }

  public void setFechaReserva(String fechaReserva) {
    this.fechaReserva = fechaReserva;
  }

  public String getEstadoReserva() {
    return estadoReserva;
  }

  public void setEstadoReserva(String estadoReserva) {
    this.estadoReserva = estadoReserva;
  }

  public String getDetallesReserva() {
    return detallesReserva;
  }

  public void setDetallesReserva(String detallesReserva) {
    this.detallesReserva = detallesReserva;
  }
}