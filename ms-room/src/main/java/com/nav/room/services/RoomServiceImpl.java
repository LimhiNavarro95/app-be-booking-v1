package com.nav.room.services;

import com.nav.room.models.Room;
import com.nav.room.repositories.RoomRepository;
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
