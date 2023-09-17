package com.nav.hotel.controllers;


import com.nav.hotel.models.Hotel;
import com.nav.hotel.services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

  @Autowired
  private IHotelService service;

  @GetMapping("hotels")
  public List<Hotel> search(){
    return (List<Hotel>) this.service.search();
  }

}
