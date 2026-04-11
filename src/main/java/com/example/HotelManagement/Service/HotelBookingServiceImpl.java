package com.example.HotelManagement.Service;

import com.example.HotelManagement.Dto.HotelRequestDTO;
import com.example.HotelManagement.Entity.Hotel;
import com.example.HotelManagement.Entity.Room;
import com.example.HotelManagement.Repo.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelBookingServiceImpl implements HotelBookingService {

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
    public Hotel registerHotel(Hotel hotel) {

        if (hotel.getRoomList() != null) {
            hotel.getRoomList().forEach(room -> room.setHotel(hotel));
        }
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel registerNewHotel(HotelRequestDTO hotelRequestDTO) {
            List<Room> rooms = hotelRequestDTO.getRoomList().stream()
                    .map(roomDto -> {
                        Room room = new Room();
                        room.setRoomNumber(roomDto.getRoomNumber());
                        room.setType(roomDto.getType());
                        room.setPrice(roomDto.getPrice());
                        return room;
                    })
                    .collect(Collectors.toList());
        Hotel hotel = Hotel.builder()
                .name(hotelRequestDTO.getName())
                .description(hotelRequestDTO.getDescription())
                .contactNumber(hotelRequestDTO.getContactNumber())
                .roomList(rooms)
                .build();
        if (hotel.getRoomList() != null) {
            hotel.getRoomList().forEach(room -> room.setHotel(hotel));
        }
        Hotel registerdHotel = hotelRepo.save(hotel);
        return registerdHotel;
    }
}
