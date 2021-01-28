package com.example.demo.service.impl;

import com.example.demo.dto.response.TeamResponse;
import com.example.demo.entity.Team;
import com.example.demo.repository.ITeamRepository;
import com.example.demo.service.ITeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService implements ITeamService {

    private final ITeamRepository _teamRepository;

    public TeamService(ITeamRepository teamRepository) {
        _teamRepository = teamRepository;
    }

    @Override
    public TeamResponse getTeam(Long id) {
        Team team = _teamRepository.findOneById(id);
        return mapTeamToTeamResponse(team);
    }

    @Override
    public List<TeamResponse> getAllTeams() {
        List<Team> teams = _teamRepository.findAll();

        return teams.stream()
                .map(team -> mapTeamToTeamResponse(team))
                .collect(Collectors.toList());
    }

    private TeamResponse mapTeamToTeamResponse(Team team){
        TeamResponse teamResponse = new TeamResponse();
        teamResponse.setId(team.getId());
        teamResponse.setName(team.getName());
        teamResponse.setFounded(team.getFounded());

       return teamResponse;
    }
}
