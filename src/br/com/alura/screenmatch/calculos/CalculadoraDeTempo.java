package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

   public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
   }

    public void inclui(Serie s){
        tempoTotal += f.getDuracaoEmMinutos();
    }

}
