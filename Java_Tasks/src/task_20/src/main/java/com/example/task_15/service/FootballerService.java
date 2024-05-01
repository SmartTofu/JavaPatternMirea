package com.example.task_15.service;

import com.example.task_15.dto.FootballerDTO;
import com.example.task_15.entity.Footballer;
import com.example.task_15.repository.FootballerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class FootballerService {

    private final FootballerRepository footballerRepository;

    public Footballer create(FootballerDTO dto) {
        log.info("create footballer");
        Footballer footballer = Footballer.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .build();
        return footballerRepository.save(footballer);
    }

    public List<Footballer> readAll() {
        log.info("read all footballers");
        return footballerRepository.findAll();
    }

    public Footballer update(Footballer footballer) {
        log.info("update footballer");
        return footballerRepository.save(footballer);
    }

    public void delete(Long id) {
        log.info("delete footballer " + id);
        footballerRepository.deleteById(id);
    }
}
