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
import com.solvd.automation.lab.carina.demo.bo.azure.AzureUsers;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.Assert;
import org.testng.annotations.*;

public class AzureUserTest {

    @MethodOwner(owner = "sshukalovich")
    @Test
    public void testCreateAzureUser() throws Exception{
        String uname = "sshukalovich";
        String pword = "root";
        AzureUser user = new AzureUser();
        user.setUsername(uname);
        user.setPassword(pword);
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
    @Ignore
    public void  testGetAzureUsers() throws Exception{
        GetAzureUserMethod getAzureUserMethod = new GetAzureUserMethod();
        getAzureUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureUserMethod.callAPI();
        getAzureUserMethod.validateResponseAgainstSchema("api/azure/users/_get/rs.schema");
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testDeleteAzureUserById() {
        int delId = 3;
        DeleteAzureUserMethodById deleteAzureUserMethodById = new DeleteAzureUserMethodById(delId);
        deleteAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAzureUserMethodById.callAPI();
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testGetAzureUserById() {
        int getId = 4;
        GetAzureUserMethodById getAzureUserMethodById = new GetAzureUserMethodById(getId);
        getAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAzureUserMethodById.callAPI();
        getAzureUserMethodById.validateResponse(JSONCompareMode.STRICT);
    }

    @MethodOwner(owner = "vbkoshak")
    @Test
    public void testPutAzureUserById() throws Exception {
        String uname = "vbkoshak";
        String pword = "qwerty";
        int id = 8;

        AzureUser user = new AzureUser();
        user.setPassword(pword);
        user.setUsername(uname);
        user.setId(id);

        PutAzureUserMethodById putAzureUserMethodById = new PutAzureUserMethodById(id,uname,passwd);
        putAzureUserMethodById.expectResponseStatus(HttpResponseStatusType.OK_200);
        String rs = putAzureUserMethodById.callAPI().asString();

        ObjectMapper mapper = new ObjectMapper();
        AzureUser actualUser = mapper.readValue(rs, AzureUser.class);

        Assert.assertNotNull(actualUser, "Response object cannot be null!");
        Assert.assertEquals(actualUser.getUsername(), user.getUsername(), "Username is not as expected!");
        Assert.assertEquals(actualUser.getPassword(), user.getPassword(), "Password is not as expected!");
        Assert.assertEquals(actualUser.getId(), ""+ user.getId(), "Id is not as expected!");

    }
}
