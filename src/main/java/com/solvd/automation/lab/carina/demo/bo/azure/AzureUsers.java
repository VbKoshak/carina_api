package com.solvd.automation.lab.carina.demo.bo.azure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AzureUsers {

    public final AzureUser azureUsers[];

    @JsonCreator
    public AzureUsers(
            @JsonProperty("azureUsers") AzureUser[] azureUsers
    ){
        this.azureUsers = azureUsers;
    }

    public AzureUser[] getAzureUsers() {
        return azureUsers;
    }

    public int getLength() {
        return azureUsers.length;
    }

    public static void main(String[] args) throws Exception{
        String rs = "[{\"ID\":1,\"UserName\":\"User 1\",\"Password\":\"Password1\"}]";
        ObjectMapper mapper = new ObjectMapper();
        AzureUsers au = mapper.readValue(rs, AzureUsers.class);
    }
}
