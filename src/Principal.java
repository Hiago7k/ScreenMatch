public class Principal {
    static void main() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1972;
        meuFilme.duracaoEmMinutos = 230;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);
    }
}
