package com.nav.rooms.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="room_id")
  private long roomId;

  @Column(name="hotel_id")
  private long hotelId;

  @Column(name="room_name")
  private String roomName;

  @Column(name="room_available")
  private String roomAvailable;

}
