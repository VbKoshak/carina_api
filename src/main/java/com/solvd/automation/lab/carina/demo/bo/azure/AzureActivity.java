package com.solvd.automation.lab.carina.demo.bo.azure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AzureActivity {
    private String id;
    private String title;
    private String dueDate;
    private String completed;

    @JsonCreator
    public AzureActivity(
            @JsonProperty("ID") String id,
            @JsonProperty("Title") String title,
            @JsonProperty("DueDate") String dueDate,
            @JsonProperty("Completed") String completed
    ) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public AzureActivity(String title, String dueDate, String completed) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
