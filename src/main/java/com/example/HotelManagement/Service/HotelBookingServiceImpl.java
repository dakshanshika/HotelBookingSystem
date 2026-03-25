package com.example.HotelManagement.Service;

import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Entity.Room;
import com.example.HotelManagement.Repo.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelBookingServiceImpl implements HotelBookingService{

    private final HotelRepo hotelRepo;

    @Override
    public List<Hotel> getAllHotels() {

        List<Hotel> all = hotelRepo.findAll();
        return all;
    }

    @Override
    public Hotel getHotelById(int id) {

        Optional<Hotel> byId = hotelRepo.findById(id);
        return byId.get();
    }


    @Override
    public List<Room> getAvailableRooms() {
        return List.of();
    }

    @Override
    public Hotel registerHotel() {

        Hotel hotel = Hotel.builder().name("Ecko Premier Vibrant Old")
                .contactNumber("100")
                .description("City Palace View")
                .build();

        Room room = Room.builder()
                .description("Queen size")
                .type("Delux")
                .price(4000.0)
                .hotel(hotel)
                .build();
        hotel.setRoomList(List.of(room));

        Hotel saved = hotelRepo.save(hotel);

        return saved;
    }
}
