package com.example.exam.demo;

import com.example.exam.demo.domain.entities.TicketEntity;
import com.example.exam.demo.domain.enums.Category;
import com.example.exam.demo.domain.enums.Priority;
import com.example.exam.demo.repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
