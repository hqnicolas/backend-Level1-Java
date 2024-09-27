package com.shortener.api;

import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.List;

@RestController
public class TabelaFipeController {

    public static class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private String codigo;

        public Carro(String marca, String modelo, int ano)  {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.codigo = codigo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getAno() {
            return ano;
        }

        public String getCodigo()  {
            return codigo;
        }
    }

    public static class Marca {
        private String nome;
        private String codigo;

        public Marca(String nome, String codigo)  {
            this.nome = nome;
            this.codigo = codigo;
        }

        public String getNome()  {
            return nome;
        }

        public String getCodigo()  {
            return codigo;
        }
    }
    
    public static class Modelo {
        private String id;
        private String name;
        private String codigo;

        public Modelo(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getNome() {
            return name;
        }

        public String getCodigo()  {
            return codigo;
        }
    }

    public static class Ano {
        private String id;
        private String name;
        private String codigo;

        public Ano(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getNome() {
            return name;
        }

        public String getCodigo()  {
            return codigo;
        }
    }

    public static class FipeValue {
        private String marca;
        private String modelo;
        private int ano;
        private float valor;

        public FipeValue(String marca, String modelo, int ano, float valor) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.valor = valor;
      }
    }

    @PostMapping("/fipe")
    public FipeValue getValorFipe(@RequestBody Carro carro) throws Exception  {
        String marca = carro.getMarca();
        String modelo = carro.getModelo();
        int ano = carro.getAno();

        RestClient restClient = new RestClient("https://parallelum.com.br/fipe/api/v1/");
        String jsonResponse = restClient.getJson("carros/marcas/" + getMarcaCodigo(marca) + "/modelos/" +
                getModeloCodigo(marca, modelo) + "/anos/" + getAnoId(marca, modelo, ano));

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonResponse, FipeValue.class);
    }

    private String getMarcaCodigo(String marca) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        RestClient restClient = new RestClient("https://parallelum.com.br/fipe/api/v1/");
        String jsonResponse = restClient.getJson("carros/marcas");
        List<Marca> marcas = mapper.readValue(jsonResponse,
                TypeFactory.defaultInstance().constructCollectionType(List.class, Marca.class));

        for (Marca m : marcas) {
            if (m.getNome().equalsIgnoreCase(marca)) {
                return m.getCodigo();
            }
        }

        throw new Exception("Marca não encontrada");
    }

    private String getModeloCodigo(String marca, String modelo) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        RestClient restClient = new RestClient("https://parallelum.com.br/fipe/api/v1/");
        String jsonResponse = restClient.getJson("carros/marcas/" + getMarcaCodigo(marca) + "/modelos");
        List<Modelo> modelos = mapper.readValue(jsonResponse,
                TypeFactory.defaultInstance().constructCollectionType(List.class, Modelo.class));

        for (Modelo m : modelos) {
            if (m.getNome().equalsIgnoreCase(modelo)) {
                return m.getCodigo();
            }
        }

        throw new Exception("Modelo não encontrado");
    }

    private String getAnoId(String marca, String modelo, int ano) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        RestClient restClient = new RestClient("https://parallelum.com.br/fipe/api/v1/");
        String jsonResponse = restClient.getJson("carros/marcas/" + getMarcaCodigo(marca) + "/modelos/" +
                getModeloCodigo(marca, modelo) + "/anos");

        List<Ano> anos = mapper.readValue(jsonResponse,
                TypeFactory.defaultInstance().constructCollectionType(List.class, Ano.class));

        for (Ano a : anos) {
            if (a.getNome().endsWith(String.valueOf(ano))) {
                return a.getCodigo();
            }
        }

        throw new Exception("Ano não encontrado");
    }
}
