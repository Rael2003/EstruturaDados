public class Array{
    private static Pessoa[] lista = new Pessoa[3];
    private static int indice=0;

    public static void inserir(Pessoa pessoa){
        pessoa.setId(indice+1);
        lista[indice++]=pessoa;
    }

    public static void mostrar(){
        for(int i= 0;i < indice; i++){
            System.out.println(lista[i]);
        }
    }
}