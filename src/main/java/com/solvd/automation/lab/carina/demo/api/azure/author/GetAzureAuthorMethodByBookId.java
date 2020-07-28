package com.solvd.automation.lab.carina.demo.api.azure.author;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class GetAzureAuthorMethodByBookId extends AbstractApiMethodV2 {
    public GetAzureAuthorMethodByBookId(int bookId) {
        super(null,null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER,ENV_API_URL);
        replaceUrlPlaceholder(URL_BOOK_ID_PLACEHOLDER,String.valueOf(bookId));
    }
}
