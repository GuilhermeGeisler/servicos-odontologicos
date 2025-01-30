package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Dentista dentista;
    private Paciente paciente;
    private List<Servico> servicos;
    private TipoExame tipoExame;

    public Venda() {
        this.servicos = new ArrayList<>();
    }

    // Getters e Setters
    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public TipoExame getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(TipoExame tipoExame) {
        this.tipoExame = tipoExame;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    // Inserindo Servico
    public void inserirServico(Servico servico) {
        if (servicos.size() >= 10) {
            throw new IllegalArgumentException("Limite máximo de serviços atingido.");
        }
        servicos.add(servico);
    }

    // Calcular Valor Servicos
    public double calcularValorServicos() {
        if (paciente == null) {
            throw new IllegalArgumentException("Paciente não definido.");
        }
        if (servicos.isEmpty()) {
            throw new IllegalArgumentException("Nenhum serviço cadastrado.");
        }

        double valorTotal = servicos.stream().mapToDouble(Servico::getValor).sum();

        if (isMesAniversario()) {
            valorTotal *= 0.95; // Aplica desconto de 5% se for o mês de aniversário do paciente
        }
        return valorTotal;
    }

    // Calcular valor dos exames
    public double calcularValorExame() {
        if (tipoExame == null) {
            throw new IllegalArgumentException("Tipo de exame não definido.");
        }

        switch (tipoExame) {
            case CONSULTA:
                return 0.0;
            case TOMOGRAFIA:
                return 450.0;
            case RADIOGRAFIA_PERIAPICAL:
                return 300.0;
            case RADIOGRAFIA_PANORAMICA:
                return 250.0;
            default:
                throw new IllegalArgumentException("Tipo de exame inválido.");
        }
    }

    // Calcula a Comissão do Dentista
    public double calcularComissao() {
        if (dentista == null) {
            throw new IllegalArgumentException("Dentista não definido.");
        }
        double valorServicos = calcularValorServicos();
        return valorServicos * (dentista.getPercentualComissao() / 100);
    }

    // Verifica o Mês do Aniversário
    public boolean isMesAniversario() {
        if (paciente == null || paciente.getDataNascimento() == null) {
            throw new IllegalArgumentException("Data de nascimento do paciente não definida.");
        }
        return paciente.getDataNascimento().getMonth() == LocalDate.now().getMonth();
    }
}