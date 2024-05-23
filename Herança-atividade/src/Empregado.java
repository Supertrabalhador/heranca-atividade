public class Colaborador {
    protected String nome;
    protected String endereco;
    protected double salario;
    



    public Colaborador (String nome, String endereco, double salario){
        this.nome=nome;
        this.endereco=endereco;
        this.salario=salario;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcIRPF(){
        double aux=0;
        if(salario>=2300 && salario<=2800){
            aux = salario*0.07;
        }else if(salario>=2800 && salario<=3750){
            aux = salario*0.015;
        }else if(salario>=3750 && salario<=4665){
            aux = salario*0.225;
        }else if(salario > 4665){
            aux = salario*0.275;
        }
        return aux;
    }


    public double calcINSS(){
        double aux=0;
        if(salario<=1412){
            aux=salario*0.075;

        }else if(salario>1412 && salario<2267){

            aux=salario*0.09;
        }
        else if(salario>2267 && salario<4000){

            aux=salario*0.12;

        }else if(salario>4000){

            aux=salario*0.14;
        }
        return aux;

    }

    public void imprimir(){
        System.out.println("Nome:"+getNome());
        System.out.println("Endereco:"+getEndereco());
        System.out.println("Salario:"+getSalario());

    }
}
