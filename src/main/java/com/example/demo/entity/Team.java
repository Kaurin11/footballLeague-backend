package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Team extends BaseEntity {

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date founded;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "league_id" )
    private League league;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL , orphanRemoval = true )
    private List<Player> players = new ArrayList<>();


}
