package com.solvd.automation.lab.carina.demo.api.azure.book;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureBookMethod;

import java.util.Properties;

public class GetAzureBookMethod extends AbstractApiMethodV2 implements AzureBookMethod {
    public GetAzureBookMethod() {
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
    }
}
