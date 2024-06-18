package system;

public class Cientista_dados extends Funcionario {

	public Cientista_dados(){}

	
	public Cientista_dados(String nome, String cpf, String crcd) {
		super(nome, cpf);
		this.crcd = crcd;
	}
	
	private String crcd;

	public String getCrcd() {
		return crcd;
	}

	public void setCrcd(String crcd) {
		this.crcd = crcd;
	}
	@Override
	 public double getBonusAnual(){
	        return (0.1* getsalario()) + 500;
	    }
	
	@Override
	public void saudacao() {
		System.out.println("saudacao Cientista");
	}
}
