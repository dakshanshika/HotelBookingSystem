package com.example.HotelManagement.Configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties
@Getter
@Component
public class MyConfigClass {

    @Value("${hotel.config}")
    private List<String> hotelConfig;



}
