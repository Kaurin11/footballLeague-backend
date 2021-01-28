package com.example.demo.service.impl;

import com.example.demo.dto.request.CreatePlayerRequest;
import com.example.demo.dto.response.PlayerResponse;
import com.example.demo.entity.Nationality;
import com.example.demo.entity.Player;
import com.example.demo.entity.Team;
import com.example.demo.repository.IPlayerRepository;
import com.example.demo.service.IPlayerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService implements IPlayerService {

    private final IPlayerRepository _playerRepository;

    public PlayerService(IPlayerRepository playerRepository) {
        _playerRepository = playerRepository;
    }

    @Override
    public PlayerResponse getPlayer(Long id) {
        Player player = _playerRepository.findOneById(id);
        return mapPlayerToPlayerResponse(player);
    }

    @Override
    public List<PlayerResponse> getAllPlayers() {
        List<Player> players = _playerRepository.findAll();

        return players.stream()
                .map(player -> mapPlayerToPlayerResponse(player))
                .collect(Collectors.toList());
    }

    @Override
    public PlayerResponse createPlayer(long teamId, long nationalityId, CreatePlayerRequest request) throws Exception {
        if(_playerRepository.findOneByRegistrationNumber(request.getRegistrationNumber()) != null){
            throw new Exception("Already exists.");
        }
        Player player = new Player();
        player.setFirstName(request.getFirstName());
        player.setLastName(request.getLastName());
        player.setBirthday(request.getBirthday());
        player.setRegistrationNumber(request.getRegistrationNumber());

        Team team = new Team();
        team.setId(teamId);
        player.setTeam(team);

        Nationality nationality = new Nationality();
        nationality.setId(nationalityId);
        player.setNationality(nationality);

        Player savedPlayer = _playerRepository.save(player);
        return mapPlayerToPlayerResponse(savedPlayer);
    }





    private PlayerResponse mapPlayerToPlayerResponse(Player player){
        PlayerResponse playerResponse = new PlayerResponse();
        playerResponse.setId(player.getId());
        playerResponse.setFirstName(player.getFirstName());
        playerResponse.setLastName(player.getLastName());
        playerResponse.setBirthday(player.getBirthday());
        playerResponse.setRegistrationNumber(player.getRegistrationNumber());

        return playerResponse;
    }
}
