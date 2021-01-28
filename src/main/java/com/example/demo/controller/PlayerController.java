package com.example.demo.controller;

import com.example.demo.dto.request.CreatePlayerRequest;
import com.example.demo.dto.response.PlayerResponse;
import com.example.demo.service.IPlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final IPlayerService _playerService;

    public PlayerController(IPlayerService playerService) {
        _playerService = playerService;
    }

    @GetMapping("/{id}")
    public PlayerResponse getPlayer (@PathVariable Long id) {
        return _playerService.getPlayer(id);
    }

    @GetMapping
    public List<PlayerResponse> getAllPlayers(){
        return _playerService.getAllPlayers();
    }

    @PostMapping
    public PlayerResponse createPlayer(@PathVariable("teamId") long teamId, @PathVariable("nationalityId") long nationaltyId, @RequestBody CreatePlayerRequest request) throws Exception{
        return _playerService.createPlayer(teamId,nationaltyId,request);
    }

}
