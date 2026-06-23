package net.engineeringigest.todoapp.controller;
import net.engineeringigest.todoapp.model.Task;
import net.engineeringigest.todoapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodoController {

    @Autowired
    private TaskService taskService;

    // Add Task
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    // View All Tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Complete Task
    @PutMapping("/{id}")
    public String completeTask(@PathVariable int id) {
        return taskService.completeTask(id);
    }

    // Delete Task
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }
}