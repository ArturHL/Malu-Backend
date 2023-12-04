package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;

public interface ReservationRepo {
  List<ReservationDTO> getAll();
  ReservationDTO getById(Integer id);
  List<ReservationDTO> getByClientId(Integer clientId);
  ReservationDTO save(ReservationDTO reservationDTO);
  ReservationDTO update(ReservationDTO reservationDTO);
  ReservationDTO cancel(Integer id);
  void delete(Integer id);
}
