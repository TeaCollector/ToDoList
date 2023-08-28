package ru.coffee.todolist.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description_of_task")
    private String descriptionOfTask;
    @Column(name = "dead_line")
    private LocalDateTime deadLine;
}
