package com.example.task_15;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Team;
import com.example.task_15.service.TeamService;
import com.example.task_15.repository.TeamRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TeamServiceTest {

    @Mock
    private TeamRepository teamRepository;

    @InjectMocks
    private TeamService teamService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreate() {
        TeamDTO teamDTO = new TeamDTO("TeamName", "1999");
        Team team = Team.builder().name("TeamName").creationDate("1999").build();

        when(teamRepository.save(any())).thenReturn(team);

        Team createdTeam = teamService.create(teamDTO);

        assertNotNull(createdTeam);
        assertEquals("TeamName", createdTeam.getName());
        assertEquals("1999", createdTeam.getCreationDate());
    }

    @Test
    public void testReadAll() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team(null,"Team1", "1999"));
        teams.add(new Team(null,"Team2", "1999"));

        when(teamRepository.findAll()).thenReturn(teams);

        List<Team> allTeams = teamService.readAll();

        assertNotNull(allTeams);
        assertEquals(2, allTeams.size());
    }

    @Test
    public void testUpdate() {
        Team team = new Team(null, "TeamToUpdate", "1999");

        when(teamRepository.save(any())).thenReturn(team);

        Team updatedTeam = teamService.update(team);

        assertNotNull(updatedTeam);
        assertEquals("TeamToUpdate", updatedTeam.getName());
    }

    @Test
    public void testDelete() {
        Long teamId = 1L;

        teamService.delete(teamId);

        verify(teamRepository, times(1)).deleteById(teamId);
    }
}
