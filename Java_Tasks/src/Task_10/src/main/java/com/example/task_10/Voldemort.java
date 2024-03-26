package com.example.task_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Voldemort implements Magician{
    @Autowired
    public Voldemort() {
    }
    @Override
    public void doMagic() {
        System.out.println("Doing AVADA CEDAVRA!");
    }
}
