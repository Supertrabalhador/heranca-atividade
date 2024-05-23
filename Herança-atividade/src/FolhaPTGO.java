public class FOLHAdePAGAMENTO {
    public static void main(String[] args) throws Exception {
        Mensalista men1,men2;
        Horista hora1,hora2;

        //Mensalista
        men1 = new Mensalista("Jose","Rua Alagoas",450,"Junior""pobre");
        men1.calcularSalario();
        men1.calcINSS();
        men1.imprimir();




        men2 = new Mensalista("Ana","Rua Delaine Negro",650,"Senior");
        men2.calcularSalario();
        men2.calcINSS();
        men2.imprimir();


        //Horista

        hora1 = new Horista("Carlos","Rua Ceará",20,50,50);
        hora1.calcularSalario();
        hora1.calcINSS();
        hora1.imprimir();

        hora2 = new Horista("Cristina","Rua Paraná",20,50,50);
        hora2.calcularSalario();
        hora2.calcINSS();
        hora2.imprimir();
        
        

    }
}
