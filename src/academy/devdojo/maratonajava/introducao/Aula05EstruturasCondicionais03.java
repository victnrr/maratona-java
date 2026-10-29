package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main() {
        // Doar se salário for > 5000
        // Operador ternário
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 pro Devdojo";
        String mensagemNaoDoar = "ainda nao tenho confiçoes, mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);
    }
}
