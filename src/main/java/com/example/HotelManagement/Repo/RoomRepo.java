package com.example.HotelManagement.Repo;

import com.example.HotelManagement.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepo extends JpaRepository<Room, Integer> {
    List<Room> findAllByHotelId(int hotelId);

    List<Room> findAllByDescription(String description);
}
