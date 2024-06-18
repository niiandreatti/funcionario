package system;



public class TestaAutentificacao {
    public static void main(String[] args) {
    	Gerente_TI funcionario = new Gerente_TI();

        funcionario.setnome("João Silva");
        funcionario.setcpf("12345678900");
        funcionario.setdt_nasc("01/01/1990");
        funcionario.setn_dependentes(2);
        funcionario.setsalario(3000.00);
        funcionario.setSenha("123456");
        
        
        Gerente_TI gerenteTI = new Gerente_TI("Ana Souza", "12345678900", 101, "1234", "senha123");
        System.out.println("A autenfiticacao retornou " + gerenteTI.autentificacao("senha13", "12345618900"));
        
        System.out.println("autenticou:" + funcionario.autentificacao("123456"));
    }
}

