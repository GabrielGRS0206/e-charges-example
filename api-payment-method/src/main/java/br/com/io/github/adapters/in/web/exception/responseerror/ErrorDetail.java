package br.com.io.github.adapters.in.web.exception.responseerror;

import java.io.Serializable;

public class ErrorDetail implements Serializable {

    private static final long serialVersionUID = -1442941926611708562L;

    public ErrorDetail(String field, String userMessage, String exceptionMessage) {
        this.field = field;
        this.userMessage = userMessage;
        this.exceptionMessage = exceptionMessage;
    }

    private String field;
    private String userMessage;
    private String exceptionMessage;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}