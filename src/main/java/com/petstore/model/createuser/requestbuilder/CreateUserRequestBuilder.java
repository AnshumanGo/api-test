package com.petstore.model.createuser.requestbuilder;

import com.petstore.model.createuser.request.CreateUserRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestBuilder {

    private CreateUserRequest createUserRequest;

    public CreateUserRequestBuilder() {

        createUserRequest = new CreateUserRequest();
    }

    public CreateUserRequestBuilder withId(long id) {

        createUserRequest.setId(id);
        return this;
    }

    public CreateUserRequestBuilder withUsername(String username) {

        createUserRequest.setUsername(username);
        return this;
    }

    public CreateUserRequestBuilder withFirstName(String firstName) {

        createUserRequest.setFirstName(firstName);
        return this;
    }

    public CreateUserRequestBuilder withLastName(String lastName) {

        createUserRequest.setLastName(lastName);
        return this;
    }

    public CreateUserRequestBuilder withEmail(String email) {

        createUserRequest.setEmail(email);
        return this;
    }

    public CreateUserRequestBuilder withPassword(String password) {

        createUserRequest.setPassword(password);
        return this;
    }

    public CreateUserRequestBuilder withPhone(String phone) {

        createUserRequest.setPhone(phone);
        return this;
    }

    public CreateUserRequestBuilder withUserStatus(long userStatus) {

        createUserRequest.setUserStatus(userStatus);
        return this;
    }

    public CreateUserRequest build() {

        return createUserRequest;
    }
}
