package com.solvd.automation.lab.carina.demo.api.azure.book;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureBook;

import java.util.Properties;

import static com.solvd.automation.lab.carina.demo.api.azure.CONSTANTS.*;

public class PostAzureBookMethod extends AbstractApiMethodV2 {
    public PostAzureBookMethod(AzureBook book) {
        super("api/azure/books/_post/rq.json", null, new Properties());
        replaceUrlPlaceholder(URL_PLACEHOLDER, ENV_API_URL);
        addProperty(B_TITLE_PLACEHOLDER, book.getTitle());
        addProperty(B_DESCRIPTION_PLACEHOLDER, book.getDescription());
        addProperty(B_PAGECOUNT_PLACEHOLDER, book.getPageCount());
        addProperty(B_EXCERPT_PLACEHOLDER, book.getExcerpt());
        addProperty(B_PUBLISH_DATE_PLACEHOLDER, book.getPublishDate());
    }
}
