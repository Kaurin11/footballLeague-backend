package com.example.demo.repository;

import com.example.demo.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeagueRepository extends JpaRepository <League,Long> {
}
