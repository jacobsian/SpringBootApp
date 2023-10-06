package com.example.testProject.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testProject.models.Task;
import com.example.testProject.models.UpdateRequest;
import com.example.testProject.repositories.TaskRepository;

@RestController
public class TasksController {

    @Autowired
    TaskRepository taskRepo;

    //GET /tasks <- Returns all tasks
    @GetMapping(value = "/tasks")
    public ArrayList<Task> tasks(){
        return taskRepo.GetAllTasks();
    } 
    
    //GET /tasks/:id <- Returns Task by ID
    @GetMapping(value = "/tasks/{id}")
    public Task tasks(@PathVariable("id") int id){
        return taskRepo.GetTask(id);
    } 

    //POST/tasks <- Creates a Task
    @PostMapping(value="/tasks")
    public Task addTask(@RequestBody String title){
        Task task = Task.CreateTask(title);
        taskRepo.AddTask(task);
        return task;
    }
    //PUT  /tasks/:id <- Updates a Task by ID
    @PutMapping(value="/tasks/{id}")
    public Task updateTask(@PathVariable("id") int id, @RequestBody UpdateRequest updateRequest){
        Task task = taskRepo.UpdateTask(id, updateRequest.getTitle(), updateRequest.getCompleted());
        return task;
    }
}
