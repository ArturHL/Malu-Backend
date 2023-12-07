package com.antojitosmalu.webApp.DataBase.Mappers;

import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;
import com.antojitosmalu.webApp.DataBase.Entities.Reservacion;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;

public interface ReservationMapper {
  
  @Mappings({
    @Mapping(target = "reservationId", source = "reservacion.idReserva"),
    @Mapping(target = "reservationDate", source = "reservacion.fechaReserva"),
    @Mapping(target = "reservationState", source = "reservacion.estadoReserva"),
    @Mapping(target = "reservationDetails", source = "reservacion.detallesReserva"),
    @Mapping(target = "clientId", source = "reservacion.cliente.idCliente")
  })
  ReservationDTO toReservationDTO(Reservacion reservacion);
  List<ReservationDTO> toReservationDTOs(List<Reservacion> reservaciones);

  @InheritInverseConfiguration
  Reservacion toReservacion(ReservationDTO reservationDTO);
}
