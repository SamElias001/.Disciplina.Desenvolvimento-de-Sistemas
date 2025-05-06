package pacotinho;

public class Pessoa {
    String nome;
    String endereco;
    int telefone;
    int idade;
    float peso;
    String time;
    
    public Pessoa (){
        this.nome = ".";
        this.endereco = ".";
        this.telefone = 0;
        this.idade = 0;
        this.peso = 0;
        this.time = ".";
    }
    
    public Pessoa (String pNome, String pEndereco, int pTelefone, int pIdade, float pPeso, String pTime){
        this.nome = pNome;
        this.endereco = pEndereco;
        this.telefone = pTelefone;
        this.idade = pIdade;
        this.peso = pPeso;
        this.time = pTime;
    }
    
    public void MostrarAtributos () {
        System.out.println(this.nome);
        System.out.println(this.endereco);
        System.out.println(this.telefone);
        System.out.println(this.idade);
        System.out.println(this.peso);
        System.out.println(this.time);
    }
}