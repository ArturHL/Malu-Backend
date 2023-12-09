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
@Table(name = "pedidos")
public class Pedido {
  
  // Attributes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pedido_id")
  private Integer idPedido;

  @Column(name = "fecha_pedido")
  private String fechaPedido;

  private String estado;

  // Relationships

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;

  // Getters and Setters

  public Integer getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(Integer idPedido) {
    this.idPedido = idPedido;
  }

  public String getFechaPedido() {
    return fechaPedido;
  }

  public void setFechaPedido(String fechaPedido) {
    this.fechaPedido = fechaPedido;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
}