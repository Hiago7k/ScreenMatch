package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalComBusca {
    static void main() throws IOException, InterruptedException {
        Scanner data = new Scanner(System.in);
        System.out.println("Digite o Filme que deseja buscar: ");
        String filmePesquisar = data.next();

        String endereco = "https://www.omdbapi.com/?t=";
        String endereco2 = "&apikey=6f533f65";

        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco + filmePesquisar + endereco2))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Trazendo informações do filme...");
        System.out.println(response.body());

    }
}
