package com.nav.hotel.services;

import com.nav.hotel.models.Hotel;
import com.nav.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService{

  @Autowired
  private HotelRepository hotelRepository;

  @Override
  public List<Hotel> search() {
    return (List<Hotel>) hotelRepository.findAll();
  }

}
