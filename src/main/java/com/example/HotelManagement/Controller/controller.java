package com.example.HotelManagement.Controller;

import com.example.HotelManagement.Dto.ResponseDto;
import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Exception.NoUserFoundException;
import com.example.HotelManagement.Service.HotelServiceBooking;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class controller {

    @Autowired
    private HotelServiceBooking hotelServiceBooking;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        log.info("hello! your welcome in Hotel");
        return ResponseEntity.ok("welcome");
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<String> getAllHotels(){
        List<Hotel> allHotels = hotelServiceBooking.getAllHotels();
        if(allHotels.isEmpty()) throw new NoUserFoundException();
        return ResponseEntity.ofNullable(null);
    }

}
