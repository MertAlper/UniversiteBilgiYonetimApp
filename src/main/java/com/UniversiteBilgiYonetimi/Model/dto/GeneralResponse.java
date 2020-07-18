package com.UniversiteBilgiYonetimi.Model.dto;

import java.io.Serializable;

public class GeneralResponse implements Serializable {
    private String message;

    public GeneralResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
