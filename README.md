# 🦷 Sistema de Vendas de Serviços Odontológicos

## 📖 Sobre o Projeto

Este projeto é um sistema de vendas de serviços odontológicos desenvolvido em Java, criado como parte da **Segunda Prova do Segundo Semestre**. Ele permite gerenciar vendas de serviços e exames, calcular comissões para dentistas e aplicar descontos para pacientes no mês de aniversário. O programa utiliza conceitos como manipulação de datas, tratamento de exceções e interação com o usuário via terminal.

---

## 🚀 Funcionalidades

- **Cadastro de Pacientes e Dentistas:** Permite cadastrar pacientes e dentistas com nome, data de nascimento e percentual de comissão.
- **Definição de Exames:** Oferece opções para definir o tipo de exame (consulta, tomografia, radiografia periapical ou panorâmica).
- **Inclusão de Serviços:** Permite adicionar serviços com descrição e valor.
- **Cálculo de Valores:**
  - Calcula o valor total dos serviços, aplicando um desconto de 5% se for o mês de aniversário do paciente.
  - Calcula o valor do exame com base no tipo selecionado.
  - Calcula a comissão do dentista com base no percentual definido.
- **Finalização da Venda:** Exibe um resumo detalhado da venda, incluindo informações do paciente, dentista, serviços, valores e comissão.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver o sistema.
- **Java Time**: Biblioteca para manipulação de datas.
- **GitHub**: Plataforma para versionamento e hospedagem do código.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

---

## 📦 Estrutura do Projeto

O projeto está organizado em dois pacotes principais:

1. **Model (`Model`):**
   - **Pessoa**: Classe base para `Paciente` e `Dentista`, contendo nome e data de nascimento.
   - **Paciente**: Representa um paciente, herdando de `Pessoa`.
   - **Dentista**: Representa um dentista, herdando de `Pessoa` e adicionando percentual de comissão.
   - **Servico**: Representa um serviço com descrição e valor.
   - **TipoExame**: Enum que define os tipos de exames disponíveis.
   - **Venda**: Gerencia uma venda, associando paciente, dentista, serviços e exame, além de calcular valores e comissões.
   - **Teclado**: Classe utilitária para leitura de entradas do usuário.

2. **View (`View`):**
   - **App**: Classe principal que implementa a interface de linha de comando (CLI) para interação com o usuário.

---

## 🎯 Como Usar

1. **Iniciar o Sistema:**
   - Execute a classe `App` para iniciar o sistema.

2. **Menu de Opções:**
   - O sistema exibirá um menu com as seguintes opções:
     - **1 - Definir Paciente**: Cadastre o paciente com nome e data de nascimento.
     - **2 - Definir Dentista**: Cadastre o dentista com nome, data de nascimento e percentual de comissão.
     - **3 - Definir Tipo de Exame**: Selecione o tipo de exame (consulta, tomografia, radiografia periapical ou panorâmica).
     - **4 - Incluir Servico**: Adicione serviços com descrição e valor.
     - **5 - Finalizar Venda**: Exibe o resumo da venda e calcula os valores.
     - **6 - Sair do Sistema**: Encerra o programa.

3. **Finalização da Venda:**
   - Após finalizar a venda, o sistema exibirá:
     - Informações do paciente.
     - Tipo de exame e valor.
     - Informações do dentista e comissão.
     - Lista de serviços e valores.
     - Valor total a ser pago pelo paciente.

---

## 🧑‍💻 Desenvolvedor

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/guilhermegeisler/">
        <img src="https://avatars.githubusercontent.com/u/53203780?s=400&u=9a85ac6d2d3c55a872ab0bafd1d38d8bd0da5cc4&v=4" width="100px;" alt="Foto do Guilherme Geisler"/><br>
        <sub>
          <b>Guilherme Geisler</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

---

## 📧 Contato

Se tiver alguma dúvida ou sugestão, entre em contato:

- **Guilherme Geisler**: [LinkedIn](https://www.linkedin.com/in/guilhermegeisler/) | [Email](mailto:guilherme.sgeisler@gmail.com)

---

Feito com ❤️ por [Guilherme Geisler](https://www.linkedin.com/in/guilhermegeisler/).
