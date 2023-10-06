package com.example.testProject.models;

import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private int ID;
    private String Title;
    private Boolean Completed;
    private Instant CreatedDate;
    private Instant CompletedDate;

    private static AtomicInteger idSeed = new AtomicInteger(0);

    public static Task CreateTask(String title){
        int id = idSeed.incrementAndGet();
        return new Task(id, title, false, Instant.now());
    }

    public Task() {
    }

    private Task(int ID, String Title, Boolean Completed, Instant CreatedDate) {
        this.ID = ID;
        this.Title = Title;
        this.Completed = Completed;
        this.CreatedDate = CreatedDate;
        this.CompletedDate = null;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Boolean isCompleted() {
        return this.Completed;
    }

    public Boolean getCompleted() {
        return this.Completed;
    }

    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
        if (Completed){
            CompletedDate = Instant.now();
        }
        else{
            CompletedDate = null;
        }
    }

    public Instant getCreatedDate() {
        return this.CreatedDate;
    }

    public Instant getCompletedDate() {
        return this.CompletedDate;
    }

    public Task ID(int ID) {
        setID(ID);
        return this;
    }

    public Task Title(String Title) {
        setTitle(Title);
        return this;
    }

    public Task Completed(Boolean Completed) {
        setCompleted(Completed);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Task)) {
            return false;
        }
        Task task = (Task) o;
        return ID == task.ID && Objects.equals(Title, task.Title) && Objects.equals(Completed, task.Completed) && Objects.equals(CreatedDate, task.CreatedDate) && Objects.equals(CompletedDate, task.CompletedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Title, Completed, CreatedDate, CompletedDate);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", Title='" + getTitle() + "'" +
            ", Completed='" + isCompleted() + "'" +
            ", CreatedDate='" + getCreatedDate() + "'" +
            ", CompletedDate='" + getCompletedDate() + "'" +
            "}";
    }

    
}
