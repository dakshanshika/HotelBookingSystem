package com.example.HotelManagement.Exception;


import com.example.HotelManagement.Dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ResponseDto> hotelNotFoundExceptionHandler(HotelNotFoundException ex){
        ResponseDto responseDto = ResponseDto.builder().msg("Hotel does not exist!!")
                .status(HttpStatus.NOT_FOUND)
                .build();

        return ResponseEntity.ok(responseDto);
    }
}
