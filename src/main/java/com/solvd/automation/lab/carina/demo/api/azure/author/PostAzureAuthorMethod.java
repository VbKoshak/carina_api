package com.solvd.automation.lab.carina.demo.api.azure.author;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureAuthor;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PostAzureAuthorMethod extends AbstractApiMethodV2 {
    public PostAzureAuthorMethod(AzureAuthor author) {
        super("api/azure/authors/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(A_BOOK_ID_PLACEHOLDER, author.getIdBook());
        addProperty(A_FIRSTNAME_PLACEHOLDER, author.getFirstName());
        addProperty(A_SECONDNAME_PLACEHOLDER, author.getLastName());
    }
}
