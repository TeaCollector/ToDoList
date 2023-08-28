package ru.coffee.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.coffee.todolist.model.Task;
import ru.coffee.todolist.srvice.TaskService;

import java.util.List;


@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //    Main Page:
    @GetMapping("/task")
    public String getAll(Model model) {
        List<Task> taskList = taskService.getAll();
        model.addAttribute("task", taskList);
        return "all-task";
    }

    // Create task
    @GetMapping("/create-task")
    public String createTask(Task task) {

        return "create-task";
    }

    @PostMapping("/create-task")
    public String createTaskAndReturn(Task task) {
        taskService.saveTask(task);
        return "redirect:/task";
    }

//    Delete Task

    @GetMapping("/delete-task/{id}")
    public String deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
        return "redirect:/task";
    }

//    Update Task
    @GetMapping("/update-task/{id}")
    public String updateTask(@PathVariable("id") Long id, Model model) {
        Task task = taskService.findById(id);
        model.addAttribute("task", task);
        return "update-task";
    }

    @PostMapping("/update-task")
    public String updateTaskAndReturn(Task task) {
        taskService.updateTask(task);
        return "redirect:/task";
    }
}
