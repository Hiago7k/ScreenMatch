package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme seuFilme = new Filme("Titanic", 1950);
        seuFilme.avalia(6);
        var filmeDoPaulo = new Filme("DogVile", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2015);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(seuFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Brad Pit");
        buscaPorArtista.add("Dylan Obrien");
        buscaPorArtista.add("Alan Made");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
