package com.nav.hotels.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Hotel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="hotel_id")
  private long hotelId;

  @Column(name="hotel_name")
  private String hotelName;

  @Column(name="hotel_address")
  private String hotelAddress;


}
