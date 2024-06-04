package com.example.task_15.service;

import com.example.task_15.dto.FootballerDTO;
import com.example.task_15.entity.Footballer;
import com.example.task_15.repository.FootballerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FootballerService {

    private final FootballerRepository footballerRepository;

    public Footballer create(FootballerDTO dto) {
        Footballer footballer = Footballer.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .build();
        return footballerRepository.save(footballer);
    }

    public List<Footballer> readAll() {
        return footballerRepository.findAll();
    }

    public Footballer update(Footballer footballer) {
        return footballerRepository.save(footballer);
    }

    public void delete(Long id) {
        footballerRepository.deleteById(id);
    }
}
