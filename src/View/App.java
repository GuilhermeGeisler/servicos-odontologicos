package View;

import java.time.LocalDate;
import Model.*;

public class App {

    public static void main(String[] args) {
        Teclado teclado = new Teclado();

        boolean finalizarSistema = false;

        while (!finalizarSistema) {
            Venda minhaVenda = new Venda(); // Cria uma nova venda a cada ciclo

            boolean finalizarVenda = false;

            while (!finalizarVenda) {
                System.out.println("************ SISTEMA DE VENDAS ***************");
                System.out.println("____Inclusão de Nova venda");

                System.out.println(" 1 - Definir Paciente");
                System.out.println(" 2 - Definir Dentista");
                System.out.println(" 3 - Definir Tipo de Exame");
                System.out.println(" 4 - Incluir Servico");
                System.out.println(" 5 - FINALIZAR VENDA");
                System.out.println(" 6 - SAIR DO SISTEMA");
                int opcao = teclado.lerInt();

                switch (opcao) {
                    case 1:
                        System.out.println(" *** INFORME OS DADOS DO PACIENTE ***");
                        System.out.println(" *** Nome: ");
                        String nome = teclado.lerString();
                        System.out.println(" *** Data Nascimento (dd/mm/aaaa): ");
                        LocalDate dataNascimento = teclado.lerData();

                        Paciente paciente = new Paciente(nome, dataNascimento);
                        minhaVenda.setPaciente(paciente);
                        break;

                    case 2:
                        System.out.println(" *** INFORME OS DADOS DO DENTISTA ***");
                        System.out.println(" *** Nome: ");
                        String nomeDentista = teclado.lerString();
                        System.out.println(" *** Data Nascimento (dd/mm/aaaa): ");
                        LocalDate dataNascimentoDentista = teclado.lerData();
                        System.out.println(" *** Percentual Comissão: ");
                        double percComissao = teclado.lerDouble();

                        Dentista dentista = new Dentista(nomeDentista, dataNascimentoDentista, percComissao);
                        minhaVenda.setDentista(dentista);
                        break;

                    case 3:
                        System.out.println(" *** SELECIONE O TIPO DE EXAME ***");
                        System.out.println(" *** 1 - Consulta ");
                        System.out.println(" *** 2 - Tomografia ");
                        System.out.println(" *** 3 - Radiografia Periapical ");
                        System.out.println(" *** 4 - Radiografia Panoramica ");

                        int tipoExame = teclado.lerInt();

                        if (tipoExame == 1) {
                            minhaVenda.setTipoExame(TipoExame.CONSULTA);
                        } else if (tipoExame == 2) {
                            minhaVenda.setTipoExame(TipoExame.TOMOGRAFIA);
                        } else if (tipoExame == 3) {
                            minhaVenda.setTipoExame(TipoExame.RADIOGRAFIA_PERIAPICAL);
                        } else if (tipoExame == 4) {
                            minhaVenda.setTipoExame(TipoExame.RADIOGRAFIA_PANORAMICA);
                        } else {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                        break;

                    case 4:
                        System.out.println(" *** SELECIONE OS DADOS DO SERVICO PARA INCLUSÃO ***");
                        System.out.println(" *** Descrição: ");
                        String descricao = teclado.lerString();
                        System.out.println(" *** Valor: ");
                        double valor = teclado.lerDouble();

                        minhaVenda.inserirServico(new Servico(descricao, valor));
                        break;

                    case 5:
                        try {
                            double valorServicos = minhaVenda.calcularValorServicos();
                            double valorExames = minhaVenda.calcularValorExame();
                            double valorComissao = minhaVenda.calcularComissao();

                            System.out.println(" *** FINALIZANDO VENDA ***");

                            System.out.println(" _______ INFORMAÇÕES DO PACIENTE _______ ");
                            System.out.println(" Paciente: " + minhaVenda.getPaciente().getNome());

                            System.out.println(" _______ INFORMAÇÕES DE EXAME _______ ");
                            System.out.println(" Tipo de Exame: " + minhaVenda.getTipoExame().toString());
                            System.out.println(" Valor do Exame: R$ " + minhaVenda.calcularValorExame());

                            System.out.println(" _______ INFORMAÇÕES DO DENTISTA _______ ");
                            System.out.println(" Dentista: " + minhaVenda.getDentista().getNome());
                            System.out.println(" Percentual de Comissão: " + minhaVenda.getDentista().getPercentualComissao());
                            System.out.println(" Valor da Comissão: " + valorComissao);

                            System.out.println(" _______ ITENS DA VENDA _______ ");
                            for (Servico p : minhaVenda.getServicos()) {
                                System.out.println(" --- Servico: " + p.getDescricao() + " Valor: R$ " + p.getValor());
                            }

                            System.out.println(" _______ TOTALIZAÇÃO DA VENDA _______ ");
                            System.out.println(" VALOR EXAMES: R$ " + valorExames);
                            System.out.println(" VALOR VENDA: R$ " + valorServicos);
                            System.out.println(" TOTAL A PAGAR PELO PACIENTE: R$ " + (valorExames + valorServicos));

                            finalizarVenda = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                            System.out.println("Verifique se todos os dados foram preenchidos corretamente.");
                        }
                        break;

                    case 6:
                        finalizarVenda = true;
                        finalizarSistema = true;
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        }
    }
}