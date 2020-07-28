package com.solvd.automation.lab.carina.demo.api.azure.coverPhoto;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class GetAzureCoverPhotoMethodByBookId extends AbstractApiMethodV2 {
    public GetAzureCoverPhotoMethodByBookId(int id) {
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        replaceUrlPlaceholder(URL_BOOK_ID_PLACEHOLDER, String.valueOf(id));
    }
}
