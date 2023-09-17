package com.nav.room.controllers;

import com.nav.room.models.Room;
import com.nav.room.services.IRoomService;
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
