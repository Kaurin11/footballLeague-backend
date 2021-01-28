package com.example.demo.dto.response;

import com.example.demo.entity.Nationality;
import com.example.demo.entity.Team;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private int registrationNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private Nationality nationality;

    private Team team;
}
