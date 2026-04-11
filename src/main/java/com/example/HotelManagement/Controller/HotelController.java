package com.example.HotelManagement.Controller;

import com.example.HotelManagement.Dto.HotelRequestDTO;
import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Service.HotelBookingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1")
@Tag(name = "Hotel APIs")
public class HotelController {

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


    @GetMapping("/getHotel/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int id){
        Hotel hotel = hotelBookingService.getHotelById(id);
        return ResponseEntity.ofNullable(hotel);
    }

    @PostMapping("/registerHotel")
    public ResponseEntity<Hotel> registerHotel(@Valid @RequestBody Hotel hotel){
        Hotel registeredHotel = hotelBookingService.registerHotel(hotel);
        return ResponseEntity.ofNullable(registeredHotel);
    }

//    @PostMapping("/registerNewHotel")
//    public ResponseEntity<Hotel> registerHotelNew(@RequestBody HotelRequestDTO hotelRequestDTO){
//        Hotel registeredNewHotel = hotelBookingService.registerNewHotel(hotelRequestDTO);
//        return ResponseEntity.ofNullable(registeredNewHotel);
//    }

}
