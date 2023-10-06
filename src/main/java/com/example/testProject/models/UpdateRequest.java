package com.example.testProject.models;
import java.util.Objects;

public class UpdateRequest {
    private String Title;
    private Boolean Completed;

    public UpdateRequest() {
    }

    public UpdateRequest(String Title, Boolean Completed) {
        this.Title = Title;
        this.Completed = Completed;
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
    }

    public UpdateRequest Title(String Title) {
        setTitle(Title);
        return this;
    }

    public UpdateRequest Completed(Boolean Completed) {
        setCompleted(Completed);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UpdateRequest)) {
            return false;
        }
        UpdateRequest updateRequest = (UpdateRequest) o;
        return Objects.equals(Title, updateRequest.Title) && Completed == updateRequest.Completed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Title, Completed);
    }

    @Override
    public String toString() {
        return "{" +
            " Title='" + getTitle() + "'" +
            ", Completed='" + isCompleted() + "'" +
            "}";
    }
}
