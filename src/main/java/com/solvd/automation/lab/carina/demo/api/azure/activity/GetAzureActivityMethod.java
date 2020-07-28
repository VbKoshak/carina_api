package com.solvd.automation.lab.carina.demo.api.azure.activity;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureActivityMethod;

import java.util.Properties;

public class GetAzureActivityMethod extends AbstractApiMethodV2 implements AzureActivityMethod {
    public GetAzureActivityMethod(){
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
    }
}
