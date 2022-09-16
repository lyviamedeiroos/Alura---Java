package Variaveis;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
            //casting
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 1930820990909090900l;
        short valorPequeno = 1332;
        byte valorMenor = 21;
        System.out.println(numeroGrande);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);

        float pontoFlutuante = 0.2f;
        float ponto2 = 0.1f;
        float total2 = ponto2 + pontoFlutuante;
        System.out.println(total2);

    }
}
