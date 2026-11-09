import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String operacao = sc.nextLine();

        boolean operacaoValida = false;

        operacaoValida = operacao.equals("DEPOSITO") ||
                        operacao.equals("SAQUE") ||
                            operacao.equals("TRANSFERENCIA");

        
        System.out.println(operacaoValida ? "VALID" : "INVALID");

        sc.close();

    }
}
