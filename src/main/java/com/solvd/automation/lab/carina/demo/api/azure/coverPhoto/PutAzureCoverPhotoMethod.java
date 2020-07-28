package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureCoverPhoto;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PutAzureCoverPhotoMethod extends AbstractApiMethodV2 {
    public PutAzureCoverPhotoMethod(AzureCoverPhoto cover) {
        super("api/azure/coverPhotos/_put/rqs.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, String.valueOf(cover.getId()));
        addProperty(ID_PLACEHOLDER, cover.getId());
        addProperty(CP_PHOTO_URL_PLACEHOLDER, cover.getUrl());
        addProperty(CP_BOOK_ID_PLACEHOLDER, cover.getIdBook());
    }
}
