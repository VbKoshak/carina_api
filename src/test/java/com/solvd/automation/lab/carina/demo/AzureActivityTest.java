package com.solvd.automation.lab.carina.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.lab.carina.demo.api.azure.activity.DeleteAzureActivityMethod;
import com.solvd.automation.lab.carina.demo.api.azure.activity.GetAzureActivityMethod;
import com.solvd.automation.lab.carina.demo.api.azure.activity.PostAzureActivityMethod;
import com.solvd.automation.lab.carina.demo.api.azure.activity.PutAzureActivityMethod;
import com.solvd.automation.lab.carina.demo.api.azure.author.GetAzureAuthorMethodById;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureActivity;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class AzureActivityTest {

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPostAzureActivity() throws Exception {
        String title = "someTitle";
        String dueDate = LocalDate.now().toString();
        String complete = "true";

        AzureActivity act = new AzureActivity(title, dueDate, complete);
        PostAzureActivityMethod postAzureActivityMethod = new PostAzureActivityMethod(act);
        postAzureActivityMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postAzureActivityMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureActivity actualAct = mapper.readValue(rs, AzureActivity.class);

        Assert.assertNotNull(actualAct, "Response object can not be null.");
        Assert.assertEquals(act.getCompleted(), actualAct.getCompleted(), "Status is not as expecte.");
        Assert.assertEquals(act.getTitle(), actualAct.getTitle(), "Title is not as expected.");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureActivity() {
        GetAzureActivityMethod getAzureActivityMethod = new GetAzureActivityMethod();
        getAzureActivityMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureActivityMethod.callAPI();
        getAzureActivityMethod.validateResponseAgainstSchema("api/azure/activities/_get/rsArray.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteAzureActivity() {
        int delId = 4;
        DeleteAzureActivityMethod deleteAzureActivityMethod = new DeleteAzureActivityMethod(delId);
        deleteAzureActivityMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureActivityMethod.callAPI();
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureActivityById() {
        int getId = 4;
        GetAzureAuthorMethodById getAzureAuthorMethodById = new GetAzureAuthorMethodById(getId);
        getAzureAuthorMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureAuthorMethodById.callAPI();
        getAzureAuthorMethodById.validateResponseAgainstSchema("api/azure/activities/_get/rs.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutAzureActivity() throws Exception {
        String id = "1";
        String title = "someTitle";
        String dueDate = LocalDate.now().toString();
        String complete = "true";

        AzureActivity act = new AzureActivity(id, title, dueDate, complete);
        PutAzureActivityMethod putAzureActivityMethod = new PutAzureActivityMethod(act);
        putAzureActivityMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureActivityMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureActivity actualAct = mapper.readValue(rs, AzureActivity.class);

        Assert.assertNotNull(actualAct, "Response object can not be null.");
        Assert.assertEquals(act.getCompleted(), actualAct.getCompleted(), "Status is not as expecte.");
        Assert.assertEquals(act.getTitle(), actualAct.getTitle(), "Title is not as expected.");

    }
}
