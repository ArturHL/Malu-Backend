package com.antojitosmalu.webApp.Domain.Repositories;

import java.util.List;
import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;

public interface ReservationRepo extends GlobalRepo<ReservationDTO> {
  List<ReservationDTO> getByClientId(Integer clientId);
  ReservationDTO cancel(Integer id);
}
