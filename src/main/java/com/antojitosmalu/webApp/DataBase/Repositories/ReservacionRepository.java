package com.antojitosmalu.webApp.DataBase.Repositories;

import com.antojitosmalu.webApp.Domain.Repositories.ReservationRepo;
import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;
import com.antojitosmalu.webApp.DataBase.CRUD.ReservacionCrudX;
import com.antojitosmalu.webApp.DataBase.Entities.Reservacion;
import com.antojitosmalu.webApp.DataBase.Mappers.ReservationMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservacionRepository implements ReservationRepo{
  @Autowired
  private ReservacionCrudX reservationCrudX;
  @Autowired
  private ReservationMapper mapper;

  @Override
  public List<ReservationDTO> getAll() {
    List<Reservacion> reservations = (List<Reservacion>) reservationCrudX.findAll();
    return mapper.toReservationDTOs(reservations);
  }

  @Override
  public ReservationDTO getById(Integer id) {
    Reservacion reservation = reservationCrudX.findById(id).orElse(null);
    return mapper.toReservationDTO(reservation);
  }

  @Override
  public ReservationDTO save(ReservationDTO entity) {
    Reservacion reservation = mapper.toReservacion(entity);
    reservationCrudX.save(reservation);
    return mapper.toReservationDTO(reservation);
  }

  @Override
  public ReservationDTO update(ReservationDTO entity) {
    Reservacion reservation = mapper.toReservacion(entity);
    reservationCrudX.save(reservation);
    return mapper.toReservationDTO(reservation);
  }

  @Override
  public void delete(Integer id) {
    reservationCrudX.deleteById(id);
  }

  @Override
  public List<ReservationDTO> getByClientId(Integer clientId) {
    List<Reservacion> reservations = reservationCrudX.findByClienteIdCliente(clientId);
    return mapper.toReservationDTOs(reservations);
  }

  @Override
  public ReservationDTO cancel(Integer id) {
    Reservacion reservation = reservationCrudX.findById(id).orElse(null);
    reservation.setEstadoReservacion("Cancelada");
    reservationCrudX.save(reservation);
    return mapper.toReservationDTO(reservation);
  }
}
