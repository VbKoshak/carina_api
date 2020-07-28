/*
 * Copyright 2013-2018 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.solvd.automation.lab.carina.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.lab.carina.demo.api.azure.user.*;
import com.solvd.automation.lab.carina.demo.bo.azure.AzureUser;
import org.testng.Assert;
import org.testng.annotations.*;

public class AzureUserTest {

    @MethodOwner(owner = "sshukalovich")
    @Test
    public void testCreateAzureUser() throws Exception {
        String uname = "sshukalovich";
        String pword = "root";
        AzureUser user = new AzureUser(uname,pword);
        PostAzureUserMethod postAzureUserMethod = new PostAzureUserMethod(user);
        postAzureUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = postAzureUserMethod.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureUser actualUser = mapper.readValue(rs, AzureUser.class);

        Assert.assertNotNull(actualUser, "Response object cannot be null!");
        Assert.assertEquals(actualUser.getUsername(), user.getUsername(), "Username is not as expected!");
        Assert.assertEquals(actualUser.getPassword(), user.getPassword(), "Password is not as expected!");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void  testGetAzureUsers() {
        GetAzureUserMethod getAzureUserMethod = new GetAzureUserMethod();
        getAzureUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureUserMethod.callAPI();
        getAzureUserMethod.validateResponseAgainstSchema("api/azure/users/_get/rsArray.schema");
    }

    /**
     * where delId - id of existing user
     */
    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteAzure() {
        int delId = 3;
        DeleteAzureUserMethodById deleteAzureUserMethodById = new DeleteAzureUserMethodById(delId);
        deleteAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureUserMethodById.callAPI();
    }

    /**
     * where getId - id of existing user
     */
    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureUserById() {
        int getId = 4;
        GetAzureUserMethodById getAzureUserMethodById = new GetAzureUserMethodById(getId);
        getAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureUserMethodById.callAPI();
        getAzureUserMethodById.validateResponseAgainstSchema("api/azure/users/_get/rs.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutAzureUser() throws Exception {
        String uname = "vbkoshak";
        String pword = "qwerty";
        int id = 8;

        AzureUser user = new AzureUser(String.valueOf(id),uname,pword);

        PutAzureUserMethodById putAzureUserMethodById = new PutAzureUserMethodById(user);
        putAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureUserMethodById.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureUser actualUser = mapper.readValue(rs, AzureUser.class);

        Assert.assertNotNull(actualUser, "Response object cannot be null!");
        Assert.assertEquals(actualUser.getUsername(), user.getUsername(), "Username is not as expected!");
        Assert.assertEquals(actualUser.getPassword(), user.getPassword(), "Password is not as expected!");
        Assert.assertEquals(actualUser.getId(), String.valueOf(user.getId()), "Id is not as expected!");

    }
}
