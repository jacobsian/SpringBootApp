package com.example.testProject.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.testProject.models.Task;

@Component
public class TaskRepository {

    private ArrayList<Task> taskList;

    public TaskRepository(){
        taskList = new ArrayList<Task>();
    }

    public ArrayList<Task> GetAllTasks(){
        return taskList;
    }

    public Task GetTask(int id){
        return taskList.stream().filter(t->t.getID() == id).findFirst().orElseThrow();
    }

    public void AddTask(Task task){
        taskList.add(task);
    }

    public Task UpdateTask(int id, String newTitle, Boolean completed){
        Task existingTask = GetTask(id);
        int taskIndex = taskList.indexOf(existingTask);

        if (!newTitle.isEmpty()){
            existingTask.setTitle(newTitle);
        }

        if (completed != null){
            existingTask.setCompleted(completed);
        }



        return taskList.set(taskIndex, existingTask);
    }
}
