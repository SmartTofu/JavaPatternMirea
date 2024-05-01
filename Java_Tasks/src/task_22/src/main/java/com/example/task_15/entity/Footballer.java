package com.example.task_15.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@Table(name = "footballers")
@NoArgsConstructor
@AllArgsConstructor
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String firstName;
    public String lastName;
}

