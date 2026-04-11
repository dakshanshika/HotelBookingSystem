package com.example.HotelManagement.Dto;

import com.example.HotelManagement.Entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomDto {
    private int roomNumber;
    private String type;
    private String description;
    private double price;
    private Hotel hotel;
}
