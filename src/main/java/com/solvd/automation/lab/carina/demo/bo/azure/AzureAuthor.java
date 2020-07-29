package com.solvd.automation.lab.carina.demo.bo.azure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AzureAuthor {
    private String id;
    private String idBook;
    private String firstName;
    private String lastName;

    @JsonCreator
    public AzureAuthor(
            @JsonProperty("ID") String id,
            @JsonProperty("IDBook") String idBook,
            @JsonProperty("FirstName") String firstName,
            @JsonProperty("LastName") String lastName
    ) {
        this.id = id;
        this.idBook = idBook;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AzureAuthor(String idBook, String firstName, String lastName) {
        this.idBook = idBook;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
