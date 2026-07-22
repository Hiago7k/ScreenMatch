import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    static void main() {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.setDuracaoEmMinutos(230);

        Filme seuFilme = new Filme("Titanic", 1950);
        seuFilme.setDuracaoEmMinutos(530);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2015);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(45);
        lost.setEpisodiosPorTemporada(12);
        System.out.println("Duração para terminar lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(seuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Episodio ep1 = new Episodio();
        ep1.setNumero(10);
        ep1.setNome("Os mortos caminham");
        ep1.setTotalVisualizacoes(2000);
        ep1.setSerie(lost);

        Recomendacao filtro = new Recomendacao();

        var filmeDoPaulo = new Filme("DogVile", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(seuFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(0).getNome());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(1).getNome());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(2).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("método to string "+ listaDeFilmes.get(0).toString());



    }
}
