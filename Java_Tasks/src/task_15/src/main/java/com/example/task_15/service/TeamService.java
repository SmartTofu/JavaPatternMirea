package com.example.task_15.service;


import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Team;
import com.example.task_15.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public Team create(TeamDTO dto) {
        Team footballer = Team.builder()
                .name(dto.getName())
                .creationDate(dto.getCreationDate())
                .build();
        return teamRepository.save(footballer);
    }

    public List<Team> readAll() {
        return teamRepository.findAll();
    }

    public Team update(Team team) {
        return teamRepository.save(team);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}
