package com.solvd.automation.lab.carina.demo.api.azure.activity;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureActivity;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PostAzureActivityMethod extends AbstractApiMethodV2 {
    public PostAzureActivityMethod(AzureActivity activ) {
        super("api/azure/activities/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(AC_TITLE_PLACEHOLDER, activ.getTitle());
        addProperty(AC_DUEDATE_PLACEHOLDER, activ.getDueDate());
        addProperty(AC_COMPLETE_PLACEHOLDER, activ.getCompleted());
    }
}
