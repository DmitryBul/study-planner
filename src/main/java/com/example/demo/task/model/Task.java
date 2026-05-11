package com.example.demo.task.model;

import com.example.demo.authservice.model.User;
import java.time.LocalDateTime;
import com.example.demo.task.model.TaskStatus;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime deadline;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}