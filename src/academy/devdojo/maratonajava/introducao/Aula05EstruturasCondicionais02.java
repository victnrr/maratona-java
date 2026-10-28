package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main() {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        if(idade < 15){
            System.out.println("Categoria infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("categoria juvenil");
        }else if(idade >= 18){
            System.out.println("categoria adulto");
        }
    }
}
