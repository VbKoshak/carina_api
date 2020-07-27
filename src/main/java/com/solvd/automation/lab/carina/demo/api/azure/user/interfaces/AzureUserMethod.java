package com.solvd.automation.lab.carina.demo.api.azure.user.interfaces;

import com.qaprosoft.carina.core.foundation.utils.Configuration;

public interface AzureUserMethod {
    String ENV_API_URL = Configuration.getEnvArg("api_azure_url");
    String URL_PLACEHOLDER = "api_azure_url";
    String ID_PLACEHOLDER = "id";
    String USERNAME_PLACEHOLDER = "username";
    String PASSWORD_PLACEHOLDER = "password";
    String URL_ID_PLACEHOLDER = "id";
}
