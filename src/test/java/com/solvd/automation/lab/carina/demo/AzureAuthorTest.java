package com.solvd.automation.lab.carina.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.lab.carina.demo.api.azure.author.*;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureAuthor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AzureAuthorTest {

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAuthors() {
        GetAzureAuthorMethod getAzureAuthorMethod = new GetAzureAuthorMethod();
        getAzureAuthorMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureAuthorMethod.callAPI();
        getAzureAuthorMethod.validateResponseAgainstSchema("api/azure/authors/_get/rsArray.schema");
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteAuthor() {
        int delId = 5;
        DeleteAzureAuthorMethod deleteAzureAuthorMethod = new DeleteAzureAuthorMethod(delId);
        deleteAzureAuthorMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureAuthorMethod.callAPI();
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAuthorById() {
        int getId = 2;
        GetAzureAuthorMethodById getAzureAuthorMethodById = new GetAzureAuthorMethodById(getId);
        getAzureAuthorMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureAuthorMethodById.callAPI();
        getAzureAuthorMethodById.validateResponseAgainstSchema("api/azure/authors/_get/rs.schema");
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAuthorByBookId() {
        int bookId = 4;
        GetAzureAuthorMethodByBookId getAzureAuthorMethodByBookId = new GetAzureAuthorMethodByBookId(bookId);
        getAzureAuthorMethodByBookId.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureAuthorMethodByBookId.callAPI();
        getAzureAuthorMethodByBookId.validateResponseAgainstSchema("api/azure/authors/_get/rsArray.schema");
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPostAuthor() throws Exception {
        String idBook = "1";
        String firstName = "name";
        String lastName = "surname";
        AzureAuthor author = new AzureAuthor(idBook,firstName,lastName);

        PostAzureAuthorMethod postAzureAuthorMethod = new PostAzureAuthorMethod(author);
        postAzureAuthorMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postAzureAuthorMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureAuthor actualAuthor = mapper.readValue(rs, AzureAuthor.class);

        Assert.assertNotNull(actualAuthor,"Response object cannot be null!");
        Assert.assertEquals(actualAuthor.getIdBook(), author.getIdBook(), "Book id is not as expected.");
        Assert.assertEquals(actualAuthor.getFirstName(), author.getFirstName(), "First name is not as expected.");
        Assert.assertEquals(actualAuthor.getLastName(), author.getLastName(), "Last name is not as expected.");
    }


    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutAuthor() throws Exception {
        String id = "1";
        String idBook = "1";
        String firstName = "name";
        String lastName = "surname";
        AzureAuthor author = new AzureAuthor(id,idBook,firstName,lastName);

        PutAzureAuthorMethod putAzureAuthorMethod = new PutAzureAuthorMethod(author);
        putAzureAuthorMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureAuthorMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureAuthor actualAuthor = mapper.readValue(rs, AzureAuthor.class);

        Assert.assertNotNull(actualAuthor,"Response object cannot be null!");
        Assert.assertEquals(actualAuthor.getIdBook(), author.getIdBook(), "Book id is not as expected.");
        Assert.assertEquals(actualAuthor.getFirstName(), author.getFirstName(), "First name is not as expected.");
        Assert.assertEquals(actualAuthor.getLastName(), author.getLastName(), "Last name is not as expected.");

    }

}
