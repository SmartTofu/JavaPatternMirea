package com.example.task_15.repository;

import com.example.task_15.entity.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballerRepository extends JpaRepository<Footballer, Long> {

}
