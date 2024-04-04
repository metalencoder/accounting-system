package org.accounting.accounting_system.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class OfficeUtils {
    private OfficeUtils() {

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);
    }
}
