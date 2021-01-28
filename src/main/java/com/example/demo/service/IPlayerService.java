package com.example.demo.service;

import com.example.demo.dto.request.CreatePlayerRequest;
import com.example.demo.dto.response.PlayerResponse;

import java.util.List;

public interface IPlayerService {

    PlayerResponse getPlayer (Long id);

    List <PlayerResponse> getAllPlayers ();

    PlayerResponse createPlayer (long teamId, long nationalityId,CreatePlayerRequest request) throws Exception;
}
