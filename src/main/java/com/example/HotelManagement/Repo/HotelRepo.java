package com.example.HotelManagement.Repo;

import com.example.HotelManagement.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {
}
