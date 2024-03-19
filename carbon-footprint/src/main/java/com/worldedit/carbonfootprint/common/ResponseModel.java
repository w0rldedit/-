package com.worldedit.carbonfootprint.common;

public class ResponseModel<T> {
    private Boolean successful;
    private String code;
    private String message;
    private T data;
    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}
    public ResponseModel(){

    }
    public ResponseModel(Boolean successful, String code, String message, T data) {
        this.successful = successful;
        this.message = message;
        this.code = code;
        this.data = data;
    }
    public ResponseModel(boolean successful) {
        this.successful = successful;
    }

    public ResponseModel<T> data(T data) {
        this.data = data;
        return this;
    }

    public ResponseModel<T> errorMessage(String errorMessage) {
        this.message = errorMessage;
        return this;
    }


    public static <T> ResponseModel<T> success(T data) {
        return new ResponseModel<T>(true).data(data);
    }

    public static ResponseModel failure(String errorMessage) {
        return new ResponseModel(false).errorMessage(errorMessage);
    }

    public ResponseModel<T> code(String code) {
        this.code = code;
        return this;
    }

    public ResponseModel<T> message(String message) {
        this.message = message;
        return this;
    }


    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public Boolean getSuccessful() {
        return successful;
    }
    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResponseModel<T> check() throws Exception {
        if (!this.getSuccessful()) {
            throw new Exception(this.getMessage());
        }
        return this;

    }
}
