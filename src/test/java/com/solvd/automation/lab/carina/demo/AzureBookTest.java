package com.solvd.automation.lab.carina.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.lab.carina.demo.api.azure.book.*;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureBook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class AzureBookTest {

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPostAzureBook() throws Exception {
        String title = "title 1";
        String description = "description 1";
        String pageCount = "10";
        String excerpt = "exc";
        String publish = LocalDateTime.now().toString();

        AzureBook book = new AzureBook(title, description, pageCount, excerpt, publish);
        PostAzureBookMethod postAzureBookMethod = new PostAzureBookMethod(book);
        postAzureBookMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postAzureBookMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureBook actualBook = mapper.readValue(rs, AzureBook.class);

        Assert.assertNotNull(actualBook, "Response object can not be null.");
        Assert.assertEquals(book.getDescription(), actualBook.getDescription(), "Expected description is not as expected");
        Assert.assertEquals(book.getExcerpt(), actualBook.getExcerpt(), "Excerpt is not as expected.");
        Assert.assertEquals(book.getPageCount(), actualBook.getPageCount(), "Page count is not as expected.");
        Assert.assertEquals(book.getTitle(), actualBook.getTitle(), "Title is not as expected.");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureBooks() {
        GetAzureBookMethod getAzureBookMethod = new GetAzureBookMethod();
        getAzureBookMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureBookMethod.callAPI();
        getAzureBookMethod.validateResponseAgainstSchema("api/azure/books/_get/rsArray.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteAzureBook() {
        int delId = 4;
        DeleteAzureBookMethod deleteAzureBookMethod = new DeleteAzureBookMethod(delId);
        deleteAzureBookMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureBookMethod.callAPI();
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureBookById() {
        int getId = 4;
        GetAzureBookMethodById getAzureBookMethodById = new GetAzureBookMethodById(getId);
        getAzureBookMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureBookMethodById.callAPI();
        getAzureBookMethodById.validateResponseAgainstSchema("api/azure/books/_get/rs.schema");
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutAzureBook() throws Exception {
        String id = "1";
        String title = "title 1";
        String description = "description 1";
        String pageCount = "10";
        String excerpt = "exc";
        String publish = LocalDateTime.now().toString();

        AzureBook book = new AzureBook(id, title, description, pageCount, excerpt, publish);
        PutAzureBookMethod putAzureBookMethod = new PutAzureBookMethod(book);
        putAzureBookMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureBookMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureBook actualBook = mapper.readValue(rs, AzureBook.class);

        Assert.assertNotNull(actualBook, "Response object can not be null.");
        Assert.assertEquals(book.getDescription(), actualBook.getDescription(), "Expected description is not as expected");
        Assert.assertEquals(book.getExcerpt(), actualBook.getExcerpt(), "Excerpt is not as expected.");
        Assert.assertEquals(book.getPageCount(), actualBook.getPageCount(), "Page count is not as expected.");
        Assert.assertEquals(book.getTitle(), actualBook.getTitle(), "Title is not as expected.");
    }
}
