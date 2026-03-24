package org.cg.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class ErrorDTO {
    private String message;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate now;
    private String uri;

    public ErrorDTO() {
    }

    public ErrorDTO(String message, LocalDate now, String uri) {
        this.message = message;
        this.now = now;
        this.uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getNow() {
        return now;
    }

    public void setNow(LocalDate now) {
        this.now = now;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
