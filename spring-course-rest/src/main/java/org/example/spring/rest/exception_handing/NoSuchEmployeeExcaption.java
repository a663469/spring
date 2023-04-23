package org.example.spring.rest.exception_handing;

public class NoSuchEmployeeExcaption extends RuntimeException {

    public NoSuchEmployeeExcaption(String message) {
        super(message);
    }
}
