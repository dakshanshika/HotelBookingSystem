package com.example.HotelManagement.Exception;


import com.example.HotelManagement.Dto.ResponseDto;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashSet;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ResponseDto> hotelNotFoundExceptionHandler(HotelNotFoundException ex){
        ResponseDto responseDto = ResponseDto.builder().msg("Hotel does not exist!!")
                .status(HttpStatus.NOT_FOUND)
                .build();

        return ResponseEntity.ok(responseDto);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseDto> ConstraintViolationExceptionHandler(ConstraintViolationException ex){
        ResponseDto responseDto = ResponseDto.builder().msg(ex.getConstraintViolations().toString())
                .status(HttpStatus.BAD_REQUEST)
                .build();

        return ResponseEntity.ok(responseDto);
    }



    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex){
        ResponseDto responseDto = ResponseDto.builder().msg(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage())
                .status(HttpStatus.BAD_REQUEST)
                .build();

        return ResponseEntity.ok(responseDto);
    }

}
