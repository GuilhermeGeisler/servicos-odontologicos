package Model;

import java.time.LocalDate;

public class Dentista extends Pessoa {
    private double percentualComissao;

    // Construtor passando parametros
    public Dentista(String nome, LocalDate dataNascimento, double percentualComissao) {
        super(nome, dataNascimento);
        this.percentualComissao = percentualComissao;
    }

    //Getters e Setters
    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}