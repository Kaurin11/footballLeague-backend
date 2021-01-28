package com.example.demo.dto.request;

import com.example.demo.entity.Nationality;
import com.example.demo.entity.Team;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CreatePlayerRequest {

    private Long id;

    private String firstName;

    private String lastName;

    private int registrationNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private Nationality nationality;

    private Team team;
}
