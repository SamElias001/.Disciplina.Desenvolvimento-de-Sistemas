package pacotinho;

public class Principal {

    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        Pessoa1.MostrarAtributos();
        System.out.println("-----------------------");
        Pessoa Pessoa2 = new Pessoa("Samuel","Buena Vista",40028922,20,(float) 67.7,"Real Madrid");
        Pessoa2.MostrarAtributos();
    }
    
}
