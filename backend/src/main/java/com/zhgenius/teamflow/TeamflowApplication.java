package com.zhgenius.teamflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TeamflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamflowApplication.class, args);
    }

}
