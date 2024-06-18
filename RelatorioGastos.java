package system;

public class RelatorioGastos {
	private double totalSalario = 0;
	private double totalBonus = 0;
	Funcionario funcionario = new Funcionario();
	
	 public double gettotalSalario() {
	        return totalSalario;
	    }
	    
	    public double settotalSalario(double totalSalario){
	        return this.totalSalario = totalSalario;
	    }
	    
	    public double gettotalBonus() {
	        return totalBonus;
	    }
	    
	    public double settotalBonus(double totalSalario){
	        return this.totalBonus = totalBonus;
	    }
	    
	    
	    public void adicionaFuncionario(Funcionario funcionario) {
	    	this.totalSalario += funcionario.getsalario();
	    	this.totalBonus += funcionario.getBonusAnual();
	    }

		
		}
	    
	 

