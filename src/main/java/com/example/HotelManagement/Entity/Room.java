package com.example.HotelManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Room {

    private int roomId;
    private String type;
    private String desc;
    private LocalDate bookingDate;
    private Hotel hotel;
}
