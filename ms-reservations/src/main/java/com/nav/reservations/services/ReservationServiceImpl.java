package com.nav.reservations.services;

import com.nav.reservations.models.Reservation;
import com.nav.reservations.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService{

  @Autowired
  private ReservationRepository reservationRepository;

  @Override
  public List<Reservation> search() {
    return (List<Reservation>) reservationRepository.findAll();
  }

}
