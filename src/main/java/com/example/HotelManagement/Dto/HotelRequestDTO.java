package com.example.HotelManagement.Dto;

import com.example.HotelManagement.Entity.Room;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelRequestDTO {
    private String name;
    private String description;
    private String contactNumber;
    private List<RoomDto> roomList;
}
