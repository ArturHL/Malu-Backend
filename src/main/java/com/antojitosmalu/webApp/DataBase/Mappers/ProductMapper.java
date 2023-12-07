package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Producto;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.InheritInverseConfiguration;

public interface ProductMapper {
  
  @Mappings({
    @Mapping(source = "idProducto", target = "productId"),
    @Mapping(source = "nombre", target = "name"),
    @Mapping(source = "descripcion", target = "description"),
    @Mapping(source = "precio", target = "price"),
    @Mapping(source = "stock", target = "stock"),
    @Mapping(source = "imagen", target = "image"),
    @Mapping(source = "categoria", target = "category"),
    @Mapping(source = "detallesPedidos", target = "orderDetails")
  })
  ProductDTO toProductDTO(Producto producto);

  @InheritInverseConfiguration
  Producto toProducto(ProductDTO productDTO);
}
