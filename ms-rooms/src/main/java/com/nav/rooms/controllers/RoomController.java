package com.nav.rooms.controllers;

import com.nav.rooms.models.Room;
import com.nav.rooms.services.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

  @Autowired
  private IRoomService iRoomService;

  @GetMapping("rooms")
  public List<Room> search(){
    return (List<Room>) this.iRoomService.search();
  }

}
