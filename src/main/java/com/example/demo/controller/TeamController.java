package com.example.demo.controller;

import com.example.demo.dto.response.PlayerResponse;
import com.example.demo.dto.response.TeamResponse;
import com.example.demo.service.ITeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final ITeamService _teamService;

    public TeamController(ITeamService teamService) {
        _teamService = teamService;
    }

    @GetMapping("/{id}")
    public TeamResponse getTeam (@PathVariable Long id) {
        return _teamService.getTeam(id);
    }

    @GetMapping
    public List<TeamResponse> getAllTeams(){
        return _teamService.getAllTeams();
    }
}
