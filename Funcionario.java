package system;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private String dt_nasc;
	private Integer n_dependentes;
	private double salario;
	
	
	public Funcionario(){}
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public Funcionario(String nome, String cpf, String dt_nasc, Integer n_dependentes, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nasc = dt_nasc;
		this.n_dependentes = n_dependentes;
		this.salario = salario;
		
		
	}

	public String getnome() {
        return nome;
    }
    
    public String setnome(String nome){
        return this.nome = nome;
    }
    
    public String getcpf() {
        return cpf;
    }
    
    public String setcpf(String cpf){
        return this.cpf = cpf;
    }
    
    public String getdt_nasc() {
        return dt_nasc;
    }
    
    public String setdt_nasc(String dt_nasc){
        return this.dt_nasc = dt_nasc;
    }
    
    public Integer getn_dependentes() {
        return n_dependentes;
    }
    
    public void setn_dependentes(Integer n_dependentes){
        this.n_dependentes = n_dependentes;
    }
	
	 public Double getsalario() {
        return salario;
    }
    
	 public void setsalario(double salario){
		    this.salario = salario;
	}
    
    public  abstract double getBonusAnual();
    
    public abstract void saudacao();


	}

