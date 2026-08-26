package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main() {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        System.out.println("Fora do if");
    }
}
