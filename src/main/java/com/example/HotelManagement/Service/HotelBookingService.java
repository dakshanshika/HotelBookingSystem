package com.example.HotelManagement.Service;

import com.example.HotelManagement.Dto.HotelRequestDTO;
import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Entity.Room;

import java.util.List;

public interface HotelBookingService {

    public List<Hotel> getAllHotels();
    public Hotel getHotelById(int id);
    public List<Room> getAvailableRooms();

    public Hotel registerHotel(Hotel hotel);

    Hotel registerNewHotel(HotelRequestDTO hotelRequestDTO);
}
