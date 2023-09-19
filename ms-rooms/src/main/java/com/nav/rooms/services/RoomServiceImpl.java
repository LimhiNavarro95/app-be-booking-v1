package com.nav.rooms.services;

import com.nav.rooms.models.Room;
import com.nav.rooms.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService  {

  @Autowired
  private RoomRepository roomRepository;

  @Override
  public List<Room> search() {
    return (List<Room>) roomRepository.findAll();
  }

}
