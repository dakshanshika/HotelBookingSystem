package com.example.HotelManagement.Controller;

import com.example.HotelManagement.Entity.Room;
import com.example.HotelManagement.Service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/getRoom/{hotelId}")
    public ResponseEntity<List<Room>> getRooms(@PathVariable int hotelId){
        List<Room> allroomsByHotel = roomService.getAllroomsByHotel(hotelId);
        return ResponseEntity.ok(allroomsByHotel);
    }

    @GetMapping("/getRoomByDescription/{description}")
    public ResponseEntity<List<Room>> getRoomsByDescription(@PathVariable String description){
        List<Room> allroomsByDescription = roomService.getroomByDescription(description);
        return ResponseEntity.ok(allroomsByDescription);
    }
}
