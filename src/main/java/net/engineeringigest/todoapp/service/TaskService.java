package net.engineeringigest.todoapp.service;


import net.engineeringigest.todoapp.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    // Add Task
    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    // View All Tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // Complete Task
    public String completeTask(int id) {

        for (Task task : tasks) {

            if (task.getId() == id) {
                task.setCompleted(true);
                return "Task Completed";
            }
        }

        return "Task Not Found";
    }

    // Delete Task
    public String deleteTask(int id) {

        for (int i = 0; i < tasks.size(); i++) {

            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return "Task Deleted";
            }
        }

        return "Task Not Found";
    }
}