/**escreva um código onde o usuário entra com sua altura e 
 * peso e o programa calcula o peso ideal da pessoa com a fórmula:
 * IMC(IMC) = peso / (altura * altura) e seja exibida a mensagem
 * de acordo com o resultado do IMC
*/

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a sua altura, em metros?");
        double altura = sc.nextDouble();
        System.out.println("Qual o seu peso, em quilos?");
        double peso = sc.nextDouble();
        double resultadoImc = peso / (altura * altura);

        if(resultadoImc <= 18.5){
            System.out.println("Você está abaixo do peso");
        } else if (resultadoImc > 18.5 && resultadoImc <= 24.9){
            System.out.println("Você está no seu peso ideal");
        } else if (resultadoImc >= 25 && resultadoImc <= 29.9){
            System.out.println("Você está levemente acima do peso");
        } else if (resultadoImc >= 30 && resultadoImc <= 34.9){
            System.out.println("Você está com obesidade grau I, procure um profissional");
        } else if (resultadoImc >= 35 && resultadoImc <= 39.9){
            System.out.println("Você está com obesidade grau II (Severa), procure um profissional");
        } else {
            System.out.println("Você está com obesidade grau III (Mórbida), procure um profissional");
        }

        sc.close();


    }
}
