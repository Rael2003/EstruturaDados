public class Pessoa{
    private String nome;
    private int idade;
    private int id;

    public Pessoa (){

    }

    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int n){
        this.idade = n;
    }
    
    public int getId(){
        return this.id;
    }

    public void setId(int n){
        this.id = n;
    }

    @Override
    public String toString(){
        return "nome > " + this.nome + " idade > " + this.idade; 
    }

}
