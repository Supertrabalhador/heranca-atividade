public class Horista extends Empregado {
    
    private double horas;
    double vlrHora;
    public Horista(String n, String e, double h,double Salario, double vlrHora){
        super(n, e, h);
        this.horas=h;
        this.vlrHora=vlrHora;
    }
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas*vlrHora;
    }
    
}
