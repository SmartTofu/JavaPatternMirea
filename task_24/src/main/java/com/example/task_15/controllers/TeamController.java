package com.example.task_15.controllers;

import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Team;
import com.example.task_15.service.EmailService;
import com.example.task_15.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public ResponseEntity<List<Team>> readAll() {
        return new ResponseEntity<>(teamService.readAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/team", method = RequestMethod.POST)
    public ResponseEntity<Team> create(@RequestBody TeamDTO dto) {
        emailService.sendSimpleMessage("Team was created",
                "team " + dto.getName() + " created at " + dto.getCreationDate(), "Kirill@zodium.ru");
        return new ResponseEntity<>(teamService.create(dto), HttpStatus.OK);
    }

    @DeleteMapping("/team/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        teamService.delete(id);
        return HttpStatus.OK;
    }
}

