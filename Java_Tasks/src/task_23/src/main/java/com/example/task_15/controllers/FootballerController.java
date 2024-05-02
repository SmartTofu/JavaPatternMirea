package com.example.task_15.controllers;

import com.example.task_15.dto.FootballerDTO;
import com.example.task_15.entity.Footballer;
import com.example.task_15.service.EmailService;
import com.example.task_15.service.FootballerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class FootballerController {

    private final FootballerService footballerService;

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/footballer", method = RequestMethod.GET)
    public ResponseEntity<List<Footballer>> readAll() {
        return new ResponseEntity<>(footballerService.readAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/footballer", method = RequestMethod.POST)
    public ResponseEntity<Footballer> create(@RequestBody FootballerDTO dto) {
        emailService.sendSimpleMessage("Footballer was created",
                "Footballer " + dto.getFirstName() +" " + dto.getLastName() + " was created", "Kirill@zodium.ru");
        return new ResponseEntity<>(footballerService.create(dto), HttpStatus.OK);
    }

    @DeleteMapping("/footballer/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        footballerService.delete(id);
        return HttpStatus.OK;
    }
}
