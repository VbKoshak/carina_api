package com.solvd.automation.lab.carina.demo.api.azure.activity;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureActivityMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureActivity;

import java.util.Properties;

public class PostAzureActivityMethod extends AbstractApiMethodV2 implements AzureActivityMethod {
    public PostAzureActivityMethod(AzureActivity activ) {
        super("api/azure/activities/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(TITLE_PLACEHOLDER, activ.getTitle());
        addProperty(DUEDATE_PLACEHOLDER, activ.getDueDate());
        addProperty(COMPLETE_PLACEHOLDER, activ.getCompleted());
    }
}
