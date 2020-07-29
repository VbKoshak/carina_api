package com.solvd.automation.lab.carina.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.lab.carina.demo.api.azure.coverPhoto.*;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureCoverPhoto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AzureCoverPhotoTest {

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetCovers() {
        GetAzureCoverPhotoMethod getAzureCoverPhotoMethod = new GetAzureCoverPhotoMethod();
        getAzureCoverPhotoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureCoverPhotoMethod.callAPI();
        getAzureCoverPhotoMethod.validateResponseAgainstSchema("api/azure/coverPhotos/_get/rsArray.schema");
    }

    /**
     * where delId - id of existing CoverPhoto
     */
    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteCover() {
        int delId = 50;
        DeleteAzureCoverPhotoMethodById deleteAzureCoverPhotoMethodById = new DeleteAzureCoverPhotoMethodById(delId);
        deleteAzureCoverPhotoMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureCoverPhotoMethodById.callAPI();
    }

    /**
     * where getId - id of existing CoverPhoto
     */
    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetCoverById() {
        int getId = 2;
        GetAzureCoverPhotoMethodById getAzureCoverPhotoMethodById = new GetAzureCoverPhotoMethodById(getId);
        getAzureCoverPhotoMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureCoverPhotoMethodById.callAPI();
        getAzureCoverPhotoMethodById.validateResponseAgainstSchema("api/azure/coverPhotos/_get/rs.schema");

    }

    /**
     * where bookId - id of existing bbook with covers
     */
    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetCoverByBookId() {
        int bookId = 4;
        GetAzureCoverPhotoMethodByBookId getAzureCoverPhotoMethodByBookId = new GetAzureCoverPhotoMethodByBookId(bookId);
        getAzureCoverPhotoMethodByBookId.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureCoverPhotoMethodByBookId.callAPI();
        getAzureCoverPhotoMethodByBookId.validateResponseAgainstSchema("api/azure/coverPhotos/_get/rsArray.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPostCover() throws Exception {
        String id = "1";
        String idBook = "1";
        String url = "some url";
        AzureCoverPhoto cover = new AzureCoverPhoto(id,idBook,url);

        PostAzureCoverPhotoMethod postAzureCoverPhotoMethod = new PostAzureCoverPhotoMethod(cover);
        postAzureCoverPhotoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postAzureCoverPhotoMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureCoverPhoto actualCover = mapper.readValue(rs, AzureCoverPhoto.class);

        Assert.assertNotNull(actualCover,"Response object cannot be null!");
        Assert.assertEquals(actualCover.getIdBook(),cover.getIdBook(),"Book id is not as expected");
        Assert.assertEquals(actualCover.getUrl(),cover.getUrl(),"URL is not as expected");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutCover() throws Exception {
        String id = "1";
        String idBook = "1";
        String url = "some url";
        AzureCoverPhoto cover = new AzureCoverPhoto(id,idBook,url);

        PutAzureCoverPhotoMethod putAzureCoverPhotoMethod = new PutAzureCoverPhotoMethod(cover);
        putAzureCoverPhotoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureCoverPhotoMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureCoverPhoto actualCover = mapper.readValue(rs, AzureCoverPhoto.class);

        Assert.assertNotNull(actualCover,"Response object cannot be null!");
        Assert.assertEquals(actualCover.getIdBook(),cover.getIdBook(),"Book id is not as expected");
        Assert.assertEquals(actualCover.getUrl(),cover.getUrl(),"URL is not as expected");

    }
}
