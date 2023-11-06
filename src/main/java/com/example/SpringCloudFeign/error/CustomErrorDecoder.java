package com.example.SpringCloudFeign.error;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder  implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {

        switch (response.status()){
            case 400:
                return new Exception("Bad Request");
            case 404:
                return new Exception("Resource not found");
            default:
                return new Exception("Generic error");
        }
    }
}