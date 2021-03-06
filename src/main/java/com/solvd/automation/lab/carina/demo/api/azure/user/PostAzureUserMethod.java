package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureUser;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PostAzureUserMethod extends AbstractApiMethodV2 {
    public PostAzureUserMethod(AzureUser user) {
        super("api/azure/users/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(U_USERNAME_PLACEHOLDER, user.getUsername());
        addProperty(U_PASSWORD_PLACEHOLDER, user.getPassword());
    }
}
