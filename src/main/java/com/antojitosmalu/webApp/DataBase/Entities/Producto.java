package com.antojitosmalu.webApp.DataBase.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {
  
  // Attributes

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Integer idProducto;

  private String nombre;

  private String descripcion;

  private Double precio;

  private Integer stock;

  private String imagen;

  // Relationships

  @ManyToOne
  @JoinColumn(name = "categoria_id")
  private Categoria categoria;

  @OneToMany(mappedBy = "producto")
  private List<DetallesPedido> detallesPedidos;

  // Getters and Setters

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public String getImagen() {
    return imagen;
  }

  public void setImagen(String imagen) {
    this.imagen = imagen;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public List<DetallesPedido> getDetallesPedidos() {
    return detallesPedidos;
  }

  public void setDetallesPedidos(List<DetallesPedido> detallesPedidos) {
    this.detallesPedidos = detallesPedidos;
  }
}