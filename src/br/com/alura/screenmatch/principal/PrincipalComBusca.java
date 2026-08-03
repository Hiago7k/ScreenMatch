package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String endereco = "https://www.omdbapi.com/?t=" + filmePesquisar.replace(" ",  "+") + "&apikey=6f533f65" ;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Trazendo informações do filme...");
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            //try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido pelo DTO");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ALgum erro de argumento na busca");
        } catch(ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Programa finalizou corretamente");

    }
}
