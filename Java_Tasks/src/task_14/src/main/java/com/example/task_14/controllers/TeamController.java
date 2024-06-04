package com.example.task_14.controllers;

import com.example.task_14.models.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class TeamController {
    private ArrayList<Team> teams = new ArrayList<>();

    @GetMapping("/teams")
    public @ResponseBody String returnTeams() {
        StringBuilder builder = new StringBuilder();
        for (Team team : teams) {
            builder.append(team.getName()).append(" ").append(team.getCreationDate()).append("\n");
        }
        return builder.toString();
    }

    @PutMapping("/teams/add")
    public @ResponseBody String addTeam(@RequestParam String name,
                                        @RequestParam String creationDate) {
        teams.add(new Team(name, creationDate));
        return "Success!";
    }

    @DeleteMapping(value = "/teams/delete")
    public @ResponseBody String removeTeam(@RequestParam int id) {
        if (id < 0) {
            return "There is no item with that name";
        }
        teams.remove(id);
        return "Success";
    }
}
