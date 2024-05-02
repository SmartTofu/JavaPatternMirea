package com.example.task_15.service;

import com.example.task_15.entity.Footballer;
import com.example.task_15.entity.Team;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Slf4j
@Service
public class SchedulingService {
    @Autowired
    private FootballerService footballerService;
    @Autowired
    private TeamService teamService;

    private void writeFootballer() {
        List<Footballer> footballers = footballerService.readAll();
        try {
            RandomAccessFile writer = new RandomAccessFile("backup/footballers.txt", "rw");
            writer.setLength(0);
            for (Footballer footballer : footballers) {
                String footStr = String.format("%d %s %s\n",
                        footballer.getId(),
                        footballer.getFirstName(),
                        footballer.getLastName());
                writer.write(footStr.getBytes());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeTeam() {
        List<Team> teams = teamService.readAll();
        try {
            RandomAccessFile writer = new RandomAccessFile("backup/teams.txt", "rw");
            writer.setLength(0);
            for (Team team : teams) {
                String teamStr = String.format("%d %s %s\n",
                        team.getId(),
                        team.getName(),
                        team.getCreationDate());
                writer.write(teamStr.getBytes());
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Scheduled(cron = "* */30 * * * *")
    public void makeBackup() {
        writeFootballer();
        log.info("write footballers");
        writeTeam();
        log.info("write teams footballers");
    }
}
