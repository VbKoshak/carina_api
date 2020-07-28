package com.solvd.automation.lab.carina.demo.api.azure.book;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.api.azure.interfaces.AzureBookMethod;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureBook;

import java.util.Properties;

public class PostAzureBookMethod extends AbstractApiMethodV2 implements AzureBookMethod {
    public PostAzureBookMethod(AzureBook book) {
        super("api/azure/books/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(TITLE_PLACEHOLDER, book.getTitle());
        addProperty(DESCRIPTION_PLACEHOLDER, book.getDescription());
        addProperty(PAGECOUNT_PLACEHOLDER, book.getPageCount());
        addProperty(EXCERPT_PLACEHOLDER, book.getExcerpt());
        addProperty(PUBLISH_DATE_PLACEHOLDER, book.getPublishDate());
    }
}
