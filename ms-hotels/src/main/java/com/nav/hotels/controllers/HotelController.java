package com.nav.hotels.controllers;


import com.nav.hotels.models.Hotel;
import com.nav.hotels.services.IHotelService;
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
