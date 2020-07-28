package com.solvd.automation.lab.carina.demo.api.azure.book;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class GetAzureBookMethodById extends AbstractApiMethodV2 {
    public GetAzureBookMethodById(int id) {
        super(null, null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, String.valueOf(id));
    }
}
