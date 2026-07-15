import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(230);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalDeAvaliacoes = 1;
//        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2015);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(45);
        lost.setEpisodiosPorTemporada(12);
        System.out.println("Duracao para maratonar lost: " + lost.getDuracaoEmMinutos());

    }
}
