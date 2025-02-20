package com.example.exam.demo.controllers;


import com.example.exam.demo.domain.entities.TicketEntity;
import com.example.exam.demo.service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public ResponseEntity<List<TicketEntity>> getAllTickets(){
        return new ResponseEntity<>(ticketService.findAll(), HttpStatus.OK);
    }


}
