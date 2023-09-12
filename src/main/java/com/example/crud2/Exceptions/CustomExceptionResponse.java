package com.example.crud2.Exceptions;

public class CustomExceptionResponse {
    private String error;
    private int status_code;
    private String message;
    private String timestamp;

    public CustomExceptionResponse(String error, int status_code, String message, String timestamp) {
        this.error = error;
        this.status_code = status_code;
        this.message = message;
        this.timestamp = timestamp;
    }

    // Getters and setters for error, status_code, message, and timestamp

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
