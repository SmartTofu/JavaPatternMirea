package com.example.task_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RonWeesly implements Magician{
    @Autowired
    public RonWeesly() {
    }
    @Override
    public void doMagic() {
        System.out.println("Doing VINGARDIUM LEVIOSA!");
    }
}
