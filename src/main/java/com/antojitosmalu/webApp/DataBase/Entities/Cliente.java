package com.antojitosmalu.webApp.DataBase.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

  // Attributes
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cliente_id")
  private Integer idCliente;

  private String nombre;

  private String email;

  private String direccion;

  private String telefono;

  // Relationships

  @OneToMany(mappedBy = "cliente")
  private List<Pedido> pedidos;

  @OneToMany(mappedBy = "cliente")
  private List<Reservacion> reservaciones;

  // Getters and Setters

  public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

  public List<Reservacion> getReservaciones() {
    return reservaciones;
  }

  public void setReservaciones(List<Reservacion> reservaciones) {
    this.reservaciones = reservaciones;
  }
  
}