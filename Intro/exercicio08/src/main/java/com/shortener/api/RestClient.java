package com.shortener.api;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RestClient {

    private String baseUrl;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getJson(String endpointUrl) throws Exception {
        URL url = new URL(baseUrl + "/" + endpointUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode != 200 && responseCode != 201 && responseCode != 204) {
            System.err.println("Falha : código HTTP de erro : " + responseCode);
            System.err.println("Cabecalho de resposta: " + conn.getHeaderFields());
            throw new RuntimeException("código HTTP de erro  : " + responseCode);
        }

        if (responseCode >= 400 && responseCode < 600) {
            System.err.println("Falha : HTTP Código de erro : " + responseCode);
            System.err.println("Cabecalho de resposta: " + conn.getHeaderFields());
            if (responseCode == 500) {
                System.err.println("Potencial erro de servidor..");
            }
            throw new RuntimeException("código HTTP de erro : " + responseCode);
        }

        if  (conn.getResponseCode() != 200) {
            throw new RuntimeException("Falha :código HTTP de erro : "
                    + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        StringBuilder responseOutput = new StringBuilder();
        while ((output = br.readLine()) != null)  {
            responseOutput.append(output);
        }
        conn.disconnect();

        return responseOutput.toString();
    }
}
