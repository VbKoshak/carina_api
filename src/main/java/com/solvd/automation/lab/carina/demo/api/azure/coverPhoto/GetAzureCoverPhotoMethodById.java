package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureCoverPhotoMethod;

import java.util.Properties;

public class GetAzureCoverPhotoMethodById extends AbstractApiMethodV2 implements AzureCoverPhotoMethod {
    public GetAzureCoverPhotoMethodById(int id) {
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER,"" + id);

    }
}
