package com.solvd.automation.lab.carina.demo.api.azure.interfaces;

import com.qaprosoft.carina.core.foundation.utils.Configuration;

public interface AzureMethod {
    String ENV_API_URL = Configuration.getEnvArg("api_azure_url");
    String URL_PLACEHOLDER = "api_azure_url";
    String URL_ID_PLACEHOLDER = "id";
}
