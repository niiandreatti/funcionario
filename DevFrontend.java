package system;

public class DevFrontend extends Funcionario {
	 private String crpw;
	 
	 public DevFrontend(String nome, String cpf, String crpw) {
			super(nome, cpf);
			this.crpw = crpw;
		}

	public String getCrpw() {
		return crpw;
	}

	public void setCrpw(String crpw) {
		this.crpw = crpw;
	}

	@Override
	public double getBonusAnual() {
		return this.getsalario() * 0.17;
	}

	@Override
	public void saudacao() {
		System.out.println(" saudacao dev");
		
	}
}
