package com.example.task_15.service;


import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Team;
import com.example.task_15.repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public Team create(TeamDTO dto) {
        log.info("create team");
        Team footballer = Team.builder()
                .name(dto.getName())
                .creationDate(dto.getCreationDate())
                .build();
        return teamRepository.save(footballer);
    }

    @Transactional(readOnly = true)
    public List<Team> readAll() {
        log.info("read all teams");
        return teamRepository.findAll();
    }

    @Transactional
    public Team update(Team team) {
        log.info("update team");
        return teamRepository.save(team);
    }

    @Transactional
    public void delete(Long id) {
        log.info("delete team " + id);
        teamRepository.deleteById(id);
    }
}
