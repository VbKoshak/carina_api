package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.user.interfaces.AzureUserMethod;

import java.util.Properties;

public class PostAzureUserMethod extends AbstractApiMethodV2 implements AzureUserMethod {
    public PostAzureUserMethod(String username, String password) {
        super("api/azure/users/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(USERNAME_PLACEHOLDER, username);
        addProperty(PASSWORD_PLACEHOLDER, password);
    }
}
