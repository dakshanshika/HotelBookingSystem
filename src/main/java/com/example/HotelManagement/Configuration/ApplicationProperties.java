package com.example.HotelManagement.Configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "configuration-my.app")
@Data
public class ApplicationProperties {

    private String name;

    // List of objects
    private List<Server> servers;

    private Map<String, Boolean> features;
    private Map<String, String> metadata;

    @Data
    public static class Server {
        private String host;
        private int port;
    }
}