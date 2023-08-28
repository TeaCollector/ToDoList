package ru.coffee.todolist.srvice;

import org.springframework.stereotype.Service;
import ru.coffee.todolist.model.Task;
import ru.coffee.todolist.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    public Task findById(Long id) {
        return taskRepository.getReferenceById(id);
    }
}
