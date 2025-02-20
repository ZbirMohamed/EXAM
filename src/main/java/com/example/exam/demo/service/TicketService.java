package com.example.exam.demo.service;

import com.example.exam.demo.domain.entities.TicketEntity;

import java.util.List;

public interface TicketService {

    List<TicketEntity> findAll();

    TicketEntity findTicketById(Integer id);

}
