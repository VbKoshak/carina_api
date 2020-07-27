package com.solvd.automation.lab.carina.demo.api.azure.coverPhotos;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.coverPhotos.interfaces.AzureCoverPhotoMethod;

import java.util.Properties;

public class DeleteAzureCoverPhotoMethodById extends AbstractApiMethodV2 implements AzureCoverPhotoMethod {
    public DeleteAzureCoverPhotoMethodById(int id) {
        super(null,"api/azure/coverPhotos/_delete/rs.json",new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER,"" + id);
    }
}
