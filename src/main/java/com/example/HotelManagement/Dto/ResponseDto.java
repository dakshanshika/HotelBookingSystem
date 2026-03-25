package com.example.HotelManagement.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto {

    private String msg;
    private HttpStatusCode status;
    private Object data;

}
