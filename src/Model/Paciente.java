package Model;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    // Construtor para passar os parametros
    public Paciente(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }
}