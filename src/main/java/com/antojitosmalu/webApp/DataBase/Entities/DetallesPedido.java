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
@Table(name = "detalles_pedido")
public class DetallesPedido {
  
  // Attributes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "detalle_id")
  private Integer idDetallesPedido;

  private Integer cantidad;

  @Column(name = "precio_unitario")
  private Double precioUnitario;

  // Relationships

  @ManyToOne
  @JoinColumn(name = "pedido_id")
  private Pedido pedido;

  @ManyToOne
  @JoinColumn(name = "producto_id")
  private Producto producto;

  // Getters and Setters

  public Integer getIdDetallesPedido() {
    return idDetallesPedido;
  }

  public void setIdDetallesPedido(Integer idDetallesPedido) {
    this.idDetallesPedido = idDetallesPedido;
  }

  public Pedido getIdPedido() {
    return pedido;
  }

  public void setIdPedido(Pedido idPedido) {
    this.pedido = idPedido;
  }

  public Producto getIdProducto() {
    return producto;
  }

  public void setIdProducto(Producto idProducto) {
    this.producto = idProducto;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(Double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }
}