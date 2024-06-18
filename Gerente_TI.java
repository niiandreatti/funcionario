package system;

public class Gerente_TI extends Funcionario {

	public Gerente_TI(){}


	public Gerente_TI(String nome, String cpf, int funcionario, String ramal, String senha) {
		super(nome, cpf);
		this.funcionario = funcionario;
		this.ramal = ramal;
		this.senha = senha;
	}

	private int funcionario;
	private String ramal;
	private String senha;
	
	public String getRamal() {
		return ramal;
	}
	
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	public int getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentificacao(String senha, String cpf) {
        return this.senha != null && this.senha.equals(senha) && cpf != null && cpf.length() == 11;
    }
	@Override
	 public double getBonusAnual(){
	        return (0.1* getsalario()) * this.getFuncionario();
	    }
	
	@Override
	public void saudacao() {
		System.out.println("saudacao gerente");
	}
}
