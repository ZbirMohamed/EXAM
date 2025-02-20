package com.example.exam.demo.domain.entities;


import com.example.exam.demo.domain.enums.Category;
import com.example.exam.demo.domain.enums.Priority;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "ticket")
@AllArgsConstructor @NoArgsConstructor
@ToString @Getter @Setter
@Builder
public class TicketEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    private Category category;
    private LocalDate creationDate;
}
