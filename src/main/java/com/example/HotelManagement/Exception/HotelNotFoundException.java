package com.example.HotelManagement.Exception;

public class HotelNotFoundException extends RuntimeException{
    public HotelNotFoundException(String msg){
        super(msg);
    }
}
