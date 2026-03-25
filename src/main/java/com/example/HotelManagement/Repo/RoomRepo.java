package com.example.HotelManagement.Repo;

import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Integer> {
}
