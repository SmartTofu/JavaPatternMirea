package com.example.task_15.controllers;

import com.example.task_15.dto.TeamDTO;
import com.example.task_15.entity.Footballer;
import com.example.task_15.entity.Team;
import com.example.task_15.service.EmailService;
import com.example.task_15.service.TeamService;
import lombok.AllArgsConstructor;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PersistenceContext
    private EntityManager entityManager2;

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

    @GetMapping("/team/name")
    public List<Team> nameFilter(@RequestParam(required = false) String sort) {
        CriteriaBuilder builder = entityManager2.getCriteriaBuilder();
        CriteriaQuery<Team> teamCriteriaQuery = builder.createQuery(Team.class);
        Root<Team> root = teamCriteriaQuery.from(Team.class);
        teamCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        Query<Team> query = (Query<Team>) entityManager2.createQuery(teamCriteriaQuery);
        return query.getResultList();
    }

    @GetMapping("/team/date")
    public List<Team> dateFilter(@RequestParam(required = false) String sort) {
        CriteriaBuilder builder = entityManager2.getCriteriaBuilder();
        CriteriaQuery<Team> teamCriteriaQuery = builder.createQuery(Team.class);
        Root<Team> root = teamCriteriaQuery.from(Team.class);
        teamCriteriaQuery.select(root).orderBy(builder.asc(root.get("creationDate")));
        Query<Team> query = (Query<Team>) entityManager2.createQuery(teamCriteriaQuery);
        return query.getResultList();
    }
}

