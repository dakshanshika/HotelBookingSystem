package com.example.HotelManagement.Service;

import com.example.HotelManagement.Entity.Room;
import com.example.HotelManagement.Repo.RoomRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService{

    private final RoomRepo roomRepo;

    @Override
    public List<Room> getAllroomsByHotel(int hotelId) {

        List<Room> roomsList =roomRepo.findAllByHotelId(hotelId);
        return roomsList;
    }

    @Override
    public List<Room> getroomByDescription(String description) {

        List<Room> getRoomByDescription = roomRepo.findAllByDescription(description);
        return getRoomByDescription;
    }

    @Override
    public List<Room> getAvailableRooms() {
        return List.of();
    }
}
