package com.petstore.model.createuser.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {

    private long id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phone;

    private long userStatus;

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}
