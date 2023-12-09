package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Reservacion;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ReservationMapper {
  
  @Mappings({
    @Mapping(source = "idReservacion", target = "reservationId"),
    @Mapping(source = "fechaReservacion", target = "reservationDate"),
    @Mapping(source = "estadoReservacion", target = "reservationState"),
    @Mapping(source = "detallesReservacion", target = "reservationDetails"),
    @Mapping(source = "cliente", target = "client")
  })
  ReservationDTO toReservationDTO(Reservacion reservacion);
  List<ReservationDTO> toReservationDTOs(List<Reservacion> reservaciones);

  @InheritInverseConfiguration
  Reservacion toReservacion(ReservationDTO reservationDTO);
}
