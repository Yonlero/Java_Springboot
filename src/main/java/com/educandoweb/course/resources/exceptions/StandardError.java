package com.educandoweb.course.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String mensager;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant timestamp, Integer status, String error, String mensager, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.mensager = mensager;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMensager() {
        return mensager;
    }

    public void setMensager(String mensager) {
        this.mensager = mensager;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
