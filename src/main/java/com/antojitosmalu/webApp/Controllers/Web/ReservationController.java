package com.antojitosmalu.webApp.Controllers.Web;
import com.antojitosmalu.webApp.Domain.DTO.ReservationDTO;
import com.antojitosmalu.webApp.Domain.Services.ReservationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/reservations")
public class ReservationController {
  @Autowired
  private ReservationService reservationService;

  @GetMapping("/all")
  public List<ReservationDTO> getAll(){
    return reservationService.getAll();
  }

  @GetMapping("/{id}")
  public ReservationDTO getById(@PathVariable("id") Integer id){
    return reservationService.getById(id);
  }

  @PostMapping("/save")
  public ReservationDTO save(@RequestBody ReservationDTO ReservationDTO){
    return reservationService.save(ReservationDTO);
  }

  @PutMapping("/update")
  public ReservationDTO update(@RequestBody ReservationDTO ReservationDTO){
    return reservationService.update(ReservationDTO);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable("id") Integer id){
    reservationService.delete(id);
  }

  @GetMapping("/byClientId/{clientId}")
  public List<ReservationDTO> getByClientId(@PathVariable("clientId") Integer clientId){
    return reservationService.getByClientId(clientId);
  }

  @PutMapping("/cancel/{id}")
  public ReservationDTO cancel(@PathVariable("id") Integer id){
    return reservationService.cancel(id);
  }
}
