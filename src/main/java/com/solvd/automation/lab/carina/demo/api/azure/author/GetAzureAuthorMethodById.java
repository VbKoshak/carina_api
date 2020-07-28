package com.solvd.automation.lab.carina.demo.api.azure.author;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureAuthorMethod;

import java.util.Properties;

public class GetAzureAuthorMethodById extends AbstractApiMethodV2 implements AzureAuthorMethod {
    public GetAzureAuthorMethodById(int id) {
        super(null, null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, "" + id);
    }
}
