package com.solvd.automation.lab.carina.demo.api.azure.coverPhotos;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.coverPhotos.interfaces.AzureCoverPhotoMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureCoverPhoto;

import java.util.Properties;

public class PostAzureCoverPhotoMethod extends AbstractApiMethodV2 implements AzureCoverPhotoMethod {

    public PostAzureCoverPhotoMethod(AzureCoverPhoto cover) {
        super("api/azure/coverPhotos/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        addProperty(ID_PLACEHOLDER, cover.getId());
        addProperty(BOOK_ID_PLACEHOLDER, cover.getIdBook());
        addProperty(PHOTO_URL_PLACEHOLDER, cover.getUrl());
    }
}
