package com.cakestudios.deneme.advice;

import java.util.Date;

public class ExceptionsResponse {
    private Date date;
    private String message;

    public ExceptionsResponse() {
    }

    public ExceptionsResponse(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
