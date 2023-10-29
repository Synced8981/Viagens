public class Main {

    public static void main(String[] args){
        Turista mochileiro = new Turista();
        mochileiro.setNome("Adriano");

        Turista novoTurista = new Turista("Maria");
        novoTurista.setNome("Maria");
         if(Util.validaCPF("123")){
             novoTurista.setCpf("123");
         }
         else{
             System.out.println("Cpf invalido");
         }
    }
}
