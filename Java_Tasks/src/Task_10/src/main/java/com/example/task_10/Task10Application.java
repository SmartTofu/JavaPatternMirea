package com.example.task_10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Task10Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HarryPotter harry = context.getBean(HarryPotter.class);
		harry.doMagic();
		RonWeesly ron = context.getBean(RonWeesly.class);
		ron.doMagic();
		Voldemort voldemort = context.getBean(Voldemort.class);
		voldemort.doMagic();
	}
}
