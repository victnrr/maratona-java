package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    static void main() {
        String nome = "Victor";
        String endereco = "Avenida Hélio Gueiros";
        float salario = 5400.50F;
        String dataRecebimentoSalario = "16/04/2026";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+ "confirmo que recebi o salárip de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}
