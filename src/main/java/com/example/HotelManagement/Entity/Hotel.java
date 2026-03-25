package com.example.HotelManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Hotel {

    private int id;
    private String name;
    private String desc;
    private String contactNumber;
    private List<Room> roomList;
}
