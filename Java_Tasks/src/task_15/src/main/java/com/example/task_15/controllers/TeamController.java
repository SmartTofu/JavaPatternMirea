package com.example.task_15.controllers;

import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Team;
import com.example.task_15.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public ResponseEntity<List<Team>> readAll() {
        return new ResponseEntity<>(teamService.readAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/team", method = RequestMethod.POST)
    public ResponseEntity<Team> create(@RequestBody TeamDTO dto) {
        return new ResponseEntity<>(teamService.create(dto), HttpStatus.OK);
    }

    @DeleteMapping("/team/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        teamService.delete(id);
        return HttpStatus.OK;
    }
}

