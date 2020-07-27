package com.solvd.automation.lab.carina.demo.api.azure.coverPhotos;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.coverPhotos.interfaces.AzureCoverPhotoMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureCoverPhoto;

import java.util.Properties;

public class PutAzureCoverPhotoMethod extends AbstractApiMethodV2 implements AzureCoverPhotoMethod {
    public PutAzureCoverPhotoMethod(AzureCoverPhoto cover) {
        super("api/azure/coverPhotos/_put/rqs.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, "" + cover.getId());
        addProperty(ID_PLACEHOLDER, cover.getId());
        addProperty(PHOTO_URL_PLACEHOLDER, cover.getUrl());
        addProperty(BOOK_ID_PLACEHOLDER, cover.getIdBook());
    }
}
