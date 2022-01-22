package com.example.exceptionhandlingdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class ApiError {
    private int errorCode;
    private String errorDesc;
    private Date date;

    public ApiError(int errorCode, String errorDesc, Date date) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.date = date;
    }
}
