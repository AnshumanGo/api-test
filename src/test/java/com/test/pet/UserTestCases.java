package com.test.pet;

import com.petstore.clients.createuser.CreateUserClient;
import com.petstore.model.createuser.request.CreateUserRequest;
import com.petstore.model.createuser.requestbuilder.CreateUserRequestBuilder;
import com.petstore.model.createuser.response.CreateUserResponse;
import org.testng.annotations.Test;
import utils.DateTimeUtil;

import static org.testng.Assert.assertTrue;

public class UserTestCases {

    @Test
    void createPetTest() {

        long id = DateTimeUtil.curentEpochTime();

        CreateUserRequest createUserRequest = new CreateUserRequestBuilder()
                .withId(id)
                .withUsername("name"+id)
                .withFirstName("First"+id)
                .withLastName("Fast"+id)
                .withEmail("name."+id+"@swagger.io")
                .withPassword("password"+id)
                .withPhone("+"+id)
                .withUserStatus(1)
                .build();

        CreateUserResponse createUserResponse = new CreateUserClient().createUser(createUserRequest);

        assertTrue(createUserResponse.verifyHttpStatusCode(createUserResponse,200));
        assertTrue(createUserResponse.verifyName(createUserResponse, String.valueOf(id)));
    }
}
