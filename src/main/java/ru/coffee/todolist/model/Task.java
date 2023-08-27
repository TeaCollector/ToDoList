package ru.coffee.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Task {
    @Id
    Long id;
    private String descriptionOfTask;
}
