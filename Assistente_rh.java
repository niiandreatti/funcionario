
public class Assistente_rh extends funcionario {
private int id
private string senha 


public String getid() {
    return nome;
}
public String setid(String id){
    return this.id = id;
}

public String getsenha() {
    return nome;
}
public String setsenha(String senha){
    return this.senha = senha;
}

@Override
public double getBonusAnual(){
       return (0.1* getsalario()) * this.getFuncionario();
   }

}
