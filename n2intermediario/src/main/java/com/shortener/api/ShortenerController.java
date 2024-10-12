
package com.shortener.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;


@RestController
public class ShortenerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${tinyurl.api.token}")
    private String apiToken;

    @Value("${tinyurl.api.create_url}")
    private String createUrl;

    @RequestMapping("/api")
    public ResponseEntity<?> data(@RequestBody TinyUrlRequest tinyUrlRequest) {
        String apiToken = this.apiToken;
        String createUrl = this.createUrl;
        String inputUrl = tinyUrlRequest.getUrl();

        HttpHeaders headers  = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        TinyUrlRequest requestBody = new TinyUrlRequest();
        requestBody.setUrl(inputUrl);
        requestBody.setDomain("tinyurl.com");
        requestBody.setDescription("string");
        HttpEntity<TinyUrlRequest> requestEntity  = new HttpEntity<>(requestBody, headers);
        ResponseEntity<TinyUrlResponse> responseEntity  = restTemplate.postForEntity(createUrl +  "?api_token="  + apiToken, requestEntity, TinyUrlResponse.class);
        TinyUrlResponse tinyUrlResponse  = responseEntity.getBody();
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            TinyUrlData dataItem = tinyUrlResponse.getData();
            if (dataItem != null) {
                return ResponseEntity.ok(dataItem.getTiny_url()); 
            } else {
                return ResponseEntity.status(500).body(">>>>>> URL Curta Não foi gerada! <<<<<<<");
            }
        } 
        return ResponseEntity.status(500).body(">>>>>> Falha ao criar URL Curta! <<<<<<<");
    }
}
class TinyUrlRequest {
    private String url;
    private String domain;
    private String description;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
class TinyUrlResponse {
    private int code;
    private List<String> errors;
    private TinyUrlData data;
    public TinyUrlData getData() {
        return data;
    }
    public void setData(TinyUrlData data) {
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public List<String> getErrors() {
        return errors;
    }
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
    private String tiny_url;
    public String getTiny_url() {
        return tiny_url;
    }
    public void setTiny_url(String tiny_url) {
        this.tiny_url = tiny_url;
    }
}
