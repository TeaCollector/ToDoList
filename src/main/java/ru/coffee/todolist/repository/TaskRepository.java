package ru.coffee.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.coffee.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
