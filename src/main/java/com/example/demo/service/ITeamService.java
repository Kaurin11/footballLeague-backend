package com.example.demo.service;

import com.example.demo.dto.response.TeamResponse;

import java.util.List;

public interface ITeamService {

    TeamResponse getTeam (Long id);

    List<TeamResponse> getAllTeams () ;
}
