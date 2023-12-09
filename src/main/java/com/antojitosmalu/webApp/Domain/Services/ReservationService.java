package com.antojitosmalu.webApp.Domain.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.antojitosmalu.webApp.Domain.Repositories.ReservationRepo;
import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;

import java.util.List;

@Service
public class ReservationService {
  @Autowired
  private ReservationRepo reservationRepo;

  public List<ReservationDTO> getAll(){
    return reservationRepo.getAll();
  }

  public ReservationDTO getById(Integer id){
    return reservationRepo.getById(id);
  }

  public ReservationDTO save(ReservationDTO reservationDTO){
    return reservationRepo.save(reservationDTO);
  }

  public ReservationDTO update(ReservationDTO reservationDTO){
    return reservationRepo.update(reservationDTO);
  }

  public void delete(Integer id){
    reservationRepo.delete(id);
  }

  public List<ReservationDTO> getByClientId(Integer clientId){
    return reservationRepo.getByClientId(clientId);
  }

  public ReservationDTO cancel(Integer id){
    return reservationRepo.cancel(id);
  }
}
