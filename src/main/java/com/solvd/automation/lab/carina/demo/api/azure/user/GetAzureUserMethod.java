package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureUserMethod;

import java.util.Properties;

public class GetAzureUserMethod extends AbstractApiMethodV2 implements AzureUserMethod {
    public GetAzureUserMethod(){
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
    }
}
