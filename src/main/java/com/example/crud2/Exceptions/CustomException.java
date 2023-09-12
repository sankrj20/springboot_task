package com.example.crud2.Exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomException extends RuntimeException {
    private String error;
    private int status_code;
    private String message;
    private String timestamp;

    public CustomException(String message) {
        this.error = "Generated";
        this.status_code = 400;
        this.message = message;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    // Getters for error, status_code, message, and timestamp
    public String getError() {
        return error;
    }

    public int getStatus_code() {
        return status_code;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
