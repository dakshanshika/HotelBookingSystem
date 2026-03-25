package com.example.HotelManagement.Service;

import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Entity.Room;

import java.util.List;

public interface HotelServiceBooking {

    public List<Hotel> getAllHotels();
    public Hotel getHotelById();
    public List<Room> getAvailableRooms();

}
