package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class PutAzureUserMethodById extends AbstractApiMethodV2 {

    public PutAzureUserMethodById(int id, String username, String password) {
        super("api/azure/users/_put/rq.json", null, new Properties());
        replaceUrlPlaceholder("api_azure_url", Configuration.getEnvArg("api_azure_url"));
        replaceUrlPlaceholder("id", "" + id);
        addProperty("username", username);
        addProperty("password", password);
        addProperty("id",id);
    }
}
