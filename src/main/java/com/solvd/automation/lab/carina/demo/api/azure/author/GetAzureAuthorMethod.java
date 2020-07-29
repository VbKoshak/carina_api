package com.solvd.automation.lab.carina.demo.api.azure.author;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.ENV_API_URL;
import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.URL_PLACEHOLDER;

public class GetAzureAuthorMethod extends AbstractApiMethodV2 {
    public GetAzureAuthorMethod() {
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
    }
}
