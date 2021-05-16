package com.petstore.model.createuser.response;

import com.petstore.model.BaseResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponse extends BaseResponse {

    private long code;

    private String type;

    private String message;

    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


    public boolean verifyHttpStatusCode(CreateUserResponse createUserResponse, long expectedHttpStatusCode) {

        return createUserResponse.getHttpStatusCode() == expectedHttpStatusCode;
    }

    public boolean verifyName(CreateUserResponse createUserResponse, String message) {

        return createUserResponse.getMessage().equals(message);
    }
}
