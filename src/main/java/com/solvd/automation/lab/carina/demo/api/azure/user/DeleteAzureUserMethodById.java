package com.solvd.automation.lab.carina.demo.api.azure.user;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class DeleteAzureUserMethodById extends AbstractApiMethodV2 {

    public DeleteAzureUserMethodById(int id) {
        super(null,"api/azure/users/_delete/rs.json",new Properties());
        replaceUrlPlaceholder("api_azure_url", Configuration.getEnvArg("api_azure_url"));
        replaceUrlPlaceholder("id",""+id);
    }
}
