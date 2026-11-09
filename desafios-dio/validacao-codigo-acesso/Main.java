import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String codigoAcesso = sc.nextLine();
        String codigoInformado = sc.nextLine();

        if (codigoAcesso.equals(codigoInformado)){
            System.out.println("ACESSO LIBERADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        sc.close();

    }
}
