package system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação da lista de funcionários
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        
        // Criação dos objetos Funcionario, Programador e Gerente_TI
//        Funcionario funcionario = new Funcionario();
        Programadores programador = new Programadores();
        Gerente_TI gerente = new Gerente_TI();

        // Configuração dos dados do funcionário
//        funcionario.setnome("João Silva");
//        funcionario.setcpf("123.456.789-00");
//        funcionario.setdt_nasc("01/01/1990");
//        funcionario.setn_dependentes(2);
//        funcionario.setsalario(3000.00);
//
//        // Impressão dos detalhes do funcionário
//        System.out.println("Detalhes do Funcionário:");
//        System.out.println("Nome: " + funcionario.getnome());
//        System.out.println("CPF: " + funcionario.getcpf());
//        System.out.println("Data de Nascimento: " + funcionario.getdt_nasc());
//        System.out.println("Número de Dependentes: " + funcionario.getn_dependentes());
//        System.out.println("Salário: " + funcionario.getsalario());
//        System.out.println("Bônus Anual: " + funcionario.getBonusAnual());
//        System.out.println();

        // Configuração do CRP do programador
        programador.setCrp("ABC123");
        System.out.println("CRP do Programador: " + programador.getCrp());
        System.out.println();

        // Configuração do salário e CRCd do cientista de dados
        Cientista_dados cientista = new Cientista_dados();
        cientista.setsalario(2000);
        cientista.setCrcd("XYZ456");
        System.out.println("CRCD do Cientista de Dados: " + cientista.getCrcd());
        System.out.println();

        // Configuração do número de funcionários e ramal do gerente de TI
        gerente.setFuncionario(9);
        gerente.setRamal("1234");
        gerente.setsalario(2000);
        System.out.println("Número de Funcionários do Gerente de TI: " + gerente.getFuncionario());
        System.out.println("Ramal do Gerente de TI: " + gerente.getRamal());
        System.out.println();

        // Impressão dos bônus anuais de cada funcionário
//        System.out.println("Bônus Anual do Funcionário: " + funcionario.getBonusAnual());
        System.out.println("Bônus Anual do Cientista de Dados: " + cientista.getBonusAnual());
        System.out.println("Bônus Anual do Gerente de TI: " + gerente.getBonusAnual());

        // Autenticação do gerente de TI
        Gerente_TI gerenteTI = new Gerente_TI("Ana Souza", "12345678900", 101, "1234", "senha123");
        System.out.println("A autenticação retornou " + gerenteTI.autentificacao("senha13", "12345618900"));
        programador.saudacao();
        gerente.saudacao();
        cientista.saudacao();

        // Adição de funcionários ao relatório de gastos
//        Funcionario funcionario1 = new Funcionario("João", "123.456.789-00", "1990-05-15", 2, 5000.0);
        RelatorioGastos relatorio = new RelatorioGastos();
//        relatorio.adicionaFuncionario(funcionario1);
        Gerente_TI gerente1 = new Gerente_TI("Maria", "789.456.123-00", 1, "1234", "senha123");
        relatorio.adicionaFuncionario(gerente1);

        // Impressão dos totais de salário e bônus antes da atualização
        System.out.println("Total Salário (antes): R$" + relatorio.gettotalSalario());
        System.out.println("Total Bônus (antes): R$" + relatorio.gettotalBonus());

        // Configuração do salário do cientista de dados e impressão do bônus anual
        Cientista_dados c = new Cientista_dados();
        c.setsalario(1000.0);
        System.out.println("Total Bônus (antes): R$" + c.getBonusAnual());
        
     

        // Adição do funcionário à lista de funcionários e impressão de uma mensagem de boas-vindas
        listaFuncionarios.add(c);
        for (Funcionario f1 : listaFuncionarios) {
            System.out.print("Bem-vindo, " + f1.getnome() + "! ");
            if (f1 instanceof Programadores) {
                Programadores p = (Programadores) f1;
                System.out.println("Você é um Programador com CRP " + p.getCrp());
            } else if (f1 instanceof Gerente_TI) {
                Gerente_TI g = (Gerente_TI) f1;
                System.out.println("Você é um Gerente de TI com " + g.getFuncionario() + " funcionários e ramal " + g.getRamal());
            } else if (f1 instanceof Cientista_dados) {
                Cientista_dados c1 = (Cientista_dados) f1;
                System.out.println("Você é um Cientista de Dados com CRCd " + c1.getCrcd());
            } else {
                System.out.println("Você é um Funcionário comum.");
            }
        }


    }
}
