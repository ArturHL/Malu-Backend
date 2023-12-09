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
  private Integer idReservacion;

  @Column(name = "fecha_reserva")
  private String fechaReservacion;

  @Column(name = "estado_reserva")
  private String estadoReservacion;

  @Column(name = "detalles_reserva")
  private String detallesReservacion;
  
  // Relationships

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;

  // Getters and Setters

  public Integer getIdReservacion() {
    return idReservacion;
  }

  public void setIdReservacion(Integer idReservacion) {
    this.idReservacion = idReservacion;
  }

  public String getFechaReservacion() {
    return fechaReservacion;
  }

  public void setFechaReservacion(String fechaReservacion) {
    this.fechaReservacion = fechaReservacion;
  }

  public String getEstadoReservacion() {
    return estadoReservacion;
  }

  public void setEstadoReservacion(String estadoReservacion) {
    this.estadoReservacion = estadoReservacion;
  }

  public String getDetallesReservacion() {
    return detallesReservacion;
  }

  public void setDetallesReservacion(String detallesReservacion) {
    this.detallesReservacion = detallesReservacion;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
}