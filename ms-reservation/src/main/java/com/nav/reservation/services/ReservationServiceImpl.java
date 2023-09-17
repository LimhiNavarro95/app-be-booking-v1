package com.nav.reservation.services;

import com.nav.reservation.models.Reservation;
import com.nav.reservation.repositories.ReservationRepository;
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
