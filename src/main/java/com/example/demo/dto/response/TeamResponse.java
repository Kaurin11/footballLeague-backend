package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponse {

    private Long id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date founded;


}
