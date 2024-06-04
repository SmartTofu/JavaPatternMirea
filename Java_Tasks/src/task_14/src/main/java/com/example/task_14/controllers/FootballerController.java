package com.example.task_14.controllers;

import com.example.task_14.models.Footballer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class FootballerController {

    private ArrayList<Footballer> footballers = new ArrayList<>();

    @GetMapping("/footballers")
    public @ResponseBody String returnFootballers() {
        StringBuilder builder = new StringBuilder();
        for (Footballer footballer : footballers) {
            builder.append(footballer.getFirstName()).append(" ").append(footballer.getLastName()).append("\n");
        }
        return builder.toString();
    }

    @PutMapping("/footballers/add")
    public @ResponseBody String addFootballer(@RequestParam String firstName,
                                              @RequestParam String lastName) {
        footballers.add(new Footballer(firstName, lastName));
        return "Success!";
    }

    @DeleteMapping(value = "/footballers/delete")
    public @ResponseBody String removeFootballer(@RequestParam int id) {
        if (id < 0) {
            return "There is no item with that name";
        }
        footballers.remove(id);
        return "Success";
    }
}
