package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureUserMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureUser;

import java.util.Properties;

public class PostAzureUserMethod extends AbstractApiMethodV2 implements AzureUserMethod {
    public PostAzureUserMethod(AzureUser user) {
        super("api/azure/users/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(USERNAME_PLACEHOLDER, user.getUsername());
        addProperty(PASSWORD_PLACEHOLDER, user.getPassword());
    }
}
