package com.nav.reservations.controllers;

import com.nav.reservations.models.Reservation;
import com.nav.reservations.services.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

  @Autowired
  private IReservationService reservationService;


  @GetMapping("reservations")
  public List<Reservation> search(){
    return (List<Reservation>) this.reservationService.search();
  }

}
