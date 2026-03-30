package com.example.HotelManagement.Service;

import com.example.HotelManagement.Entity.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAllroomsByHotel(int hotelId);
    public List<Room> getroomByDescription(String description);
    public List<Room> getAvailableRooms();

}
