package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Nationality extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "nationality", cascade = CascadeType.ALL , orphanRemoval = true )
    private List<Player> players = new ArrayList<>();
}
