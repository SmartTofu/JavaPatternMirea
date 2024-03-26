package com.example.task_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Magician{

    @Autowired
    public HarryPotter() {
    }
    @Override
    public void doMagic() {
        System.out.println("Doing EXPECTO PATRONUM!");
    }
}
