package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureCoverPhoto;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PostAzureCoverPhotoMethod extends AbstractApiMethodV2 {

    public PostAzureCoverPhotoMethod(AzureCoverPhoto cover) {
        super("api/azure/coverPhotos/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        addProperty(ID_PLACEHOLDER, cover.getId());
        addProperty(CP_BOOK_ID_PLACEHOLDER, cover.getIdBook());
        addProperty(CP_PHOTO_URL_PLACEHOLDER, cover.getUrl());
    }
}
