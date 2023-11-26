package br.com.alura.buscacep;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCep {

    public Endereco buscaEndereco(String cep){
        URI endereco = URI.create("https://viacep.com.br/ws/"+ cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception  e) {
            throw new RuntimeException("Endereço nao encontrado a parti do cep informado");
        }
    }
}
