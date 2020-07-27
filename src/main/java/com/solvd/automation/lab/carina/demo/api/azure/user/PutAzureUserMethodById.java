package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.user.interfaces.AzureUserMethod;

import java.util.Properties;

public class PutAzureUserMethodById extends AbstractApiMethodV2 implements AzureUserMethod {

    public PutAzureUserMethodById(int id, String username, String password) {
        super("api/azure/users/_put/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, "" + id);
        addProperty(USERNAME_PLACEHOLDER, username);
        addProperty(PASSWORD_PLACEHOLDER, password);
        addProperty(ID_PLACEHOLDER,id);
    }
}
