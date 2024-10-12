package com.shortener.api;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class RestClient {
    private int code;
    private List<TinyUrlData> data;
    private List<String> errors;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public List<TinyUrlData> getData() {
        return data;
    }
    public void setData(List<TinyUrlData> data) {
        this.data = data;
    }
    public List<String> getErrors() {
        return errors;
    }
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}

class TinyUrlData {
    private String tiny_url;
    public String getTiny_url() {
        return tiny_url;
    }
    public void setTiny_url(String tiny_url) {
        this.tiny_url = tiny_url;
    }
}
