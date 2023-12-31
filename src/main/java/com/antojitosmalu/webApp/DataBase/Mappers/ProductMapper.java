package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ProductDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Producto;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderDetailsMapper.class, CategoryMapper.class})
public interface ProductMapper {
  
  @Mappings({
    @Mapping(source = "idProducto", target = "productId"),
    @Mapping(source = "nombre", target = "name"),
    @Mapping(source = "descripcion", target = "description"),
    @Mapping(source = "precio", target = "price"),
    @Mapping(source = "stock", target = "stock"),
    @Mapping(source = "imagen", target = "image"),
    @Mapping(source = "categoria", target = "category"),
  })
  ProductDTO toProductDTO(Producto producto);
  List<ProductDTO> toProductDTOs(List<Producto> productos);

  @InheritInverseConfiguration
  @Mapping(target = "detallesPedidos", ignore = true)
  Producto toProducto(ProductDTO productDTO);
}
