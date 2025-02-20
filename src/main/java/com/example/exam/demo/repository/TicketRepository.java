package com.example.exam.demo.repository;

import com.example.exam.demo.domain.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
