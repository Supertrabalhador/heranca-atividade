public class Mensalista extends Empregado{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //CONSTRUTOR OU BUILDER
    public Mensalista(String nome, String endereco, double salario, String cargo){
        super(nome,endereco, salario);
        this.cargo=cargo;
    }
    
    public void calcularSalario(){
        if(cargo.equals("Junior")){
            salario=2400;
        }else if(cargo.equals("Pleno")){
            salario=3500;
        }else if(cargo.equals("Senior")){
            salario=5500;
        }
        
    }   

    
    
}
