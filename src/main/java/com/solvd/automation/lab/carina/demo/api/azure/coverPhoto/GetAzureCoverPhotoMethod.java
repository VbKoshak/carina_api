package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureCoverPhotoMethod;

import java.util.Properties;

public class GetAzureCoverPhotoMethod extends AbstractApiMethodV2 implements AzureCoverPhotoMethod {
    public GetAzureCoverPhotoMethod() {
        super(null,null,new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
    }
}
