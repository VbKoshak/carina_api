package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.user.interfaces.AzureUserMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureUser;

import java.util.Properties;

public class PutAzureUserMethodById extends AbstractApiMethodV2 implements AzureUserMethod {

    public PutAzureUserMethodById(AzureUser user) {
        super("api/azure/users/_put/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, "" + user.getId());
        addProperty(USERNAME_PLACEHOLDER, user.getUsername());
        addProperty(PASSWORD_PLACEHOLDER, user.getPassword());
        addProperty(ID_PLACEHOLDER,user.getId());
    }
}
