package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class DeleteAzureCoverPhotoMethodById extends AbstractApiMethodV2 {
    public DeleteAzureCoverPhotoMethodById(int id) {
        super(null,"api/azure/coverPhotos/_delete/rs.json",new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER,String.valueOf(id));
    }
}
