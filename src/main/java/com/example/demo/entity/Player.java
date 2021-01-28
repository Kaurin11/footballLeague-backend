package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Player extends BaseEntity {

    private String firstName;

    private String lastName;

    private int registrationNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "nationality_id" )
    private Nationality nationality;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "team_id" )
    private Team team;
}
