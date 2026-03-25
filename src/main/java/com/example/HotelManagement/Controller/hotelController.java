package com.example.HotelManagement.Controller;

import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Service.HotelBookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class hotelController {

    @Autowired
    private HotelBookingService hotelBookingService;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        log.info("hello! your welcome in Hotel");
        return ResponseEntity.ok("welcome");
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelBookingService.getAllHotels();
        return ResponseEntity.ok(allHotels);
    }


    @GetMapping("/registerHotel")
    public ResponseEntity<Hotel> registerHotel(){
        Hotel hotel = hotelBookingService.registerHotel();
        return ResponseEntity.ofNullable(hotel);
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<Hotel> registerHotel(@PathVariable int id){
        Hotel hotel = hotelBookingService.getHotelById(id);
        return ResponseEntity.ofNullable(hotel);
    }


}
