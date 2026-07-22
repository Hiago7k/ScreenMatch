package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        Filme seuFilme = new Filme("Titanic", 1950);
        var filmeDoPaulo = new Filme("DogVile", 2003);
        Serie lost = new Serie("Lost", 2015);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(seuFilme);
        lista.add(lost);
    }
}
