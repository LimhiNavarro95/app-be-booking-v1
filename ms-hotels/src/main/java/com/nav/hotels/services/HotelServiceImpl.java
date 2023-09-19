package com.nav.hotels.services;

import com.nav.hotels.models.Hotel;
import com.nav.hotels.repositories.HotelRepository;
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
