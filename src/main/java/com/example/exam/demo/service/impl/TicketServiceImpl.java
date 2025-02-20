package com.example.exam.demo.service.impl;

import com.example.exam.demo.domain.entities.TicketEntity;
import com.example.exam.demo.repository.TicketRepository;
import com.example.exam.demo.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<TicketEntity> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public TicketEntity findTicketById(Integer id) {
        return null;
    }
}
