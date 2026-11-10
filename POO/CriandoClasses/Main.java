import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var male = new Person();
        System.out.println("Nome do homem: ");
        male.setName(sc.nextLine());
        System.out.println("Idade do homem: ");
        male.setAge(sc.nextInt());
        nextLine(); 

        var female = new Person();
        System.out.println("Nome da mulher: ");
        female.setName(sc.nextLine());
        System.out.println("Idade da mulher: ");
        female.setAge(sc.nextInt());

        System.out.println("Nome: " + male.getName() + " Idade: " + male.getAge());
        System.out.println("Nome: " + female.getName() + " Idade: " + female.getAge());
    }

}    
