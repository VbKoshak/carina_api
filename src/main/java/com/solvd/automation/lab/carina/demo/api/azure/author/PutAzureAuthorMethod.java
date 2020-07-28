package com.solvd.automation.lab.carina.demo.api.azure.author;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureAuthorMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureAuthor;

import java.util.Properties;

public class PutAzureAuthorMethod extends AbstractApiMethodV2 implements AzureAuthorMethod {
    public PutAzureAuthorMethod(AzureAuthor author) {
        super("api/azure/authors/_put/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        replaceUrlPlaceholder(URL_ID_PLACEHOLDER, author.getId());
        addProperty(ID_PLACEHOLDER, author.getId());
        addProperty(BOOK_ID_PLACEHOLDER, author.getIdBook());
        addProperty(FIRSTNAME_PLACEHOLDER, author.getFirstName());
        addProperty(SECONDNAME_PLACEHOLDER, author.getLastName());
    }
}
