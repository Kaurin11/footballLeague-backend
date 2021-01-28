package com.example.demo.repository;

import com.example.demo.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends JpaRepository <Player, Long> {

    Player findOneById (Long id);

    Player findOneByRegistrationNumber (int registrationNumber);
}
