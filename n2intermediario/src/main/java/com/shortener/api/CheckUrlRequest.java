package com.shortener.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;


    @RestController
    public class CheckUrlRequest {

        @Autowired
        private RestClient restClient;

        @Autowired
        private RestTemplate restTemplate;

        @Value("${tinyurl.api.token}")
        private String apiToken;

        @Value("${tinyurl.api.check_url}")
        private String checkUrl;


    @PostMapping("/data")
    public ResponseEntity<?> data(@RequestBody DateRangeRequest dateRange) {
        String apiToken = this.apiToken;
        String checkUrl = this.checkUrl;
        String from = dateRange.getFrom();
        String to = dateRange.getTo();
        String url = String.format(checkUrl, from, to, apiToken);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiToken);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<RestClient> response = restTemplate.exchange(url, HttpMethod.GET, entity, RestClient.class);
        return ResponseEntity.ok(response.getBody().getData());
    }

    public static class DateRangeRequest {
        private String from;
        private String to;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }
    }
}
