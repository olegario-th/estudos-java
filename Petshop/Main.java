import java.util.Scanner;

private final static Scanner sc = new Scanner(System.in);

private final static PetMachine petmachine = new PetMachine();

public class Main {
    public static void main(String[] args){
        
        var option = -1;

        do {
            System.out.println("=== Escolha uma opção ===");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = sc.nextInt();

            switch(option){
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> System.out.println("Nível de água: " + petMachine.getWater());
                case 5 -> System.out.println("Nível de shampoo: " + petMachine.getShampoo());
                case 6 -> petMachine.hasPet();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        }while(option != 0);
    }

    public static void setPetInMachine(){
         String name = "";
        while(name == null ||name.isEmpty()){
            System.out.println("Informe o nome do pet: ");
            name = sc.nextLine();
        }
        System.out.println("Informe o nome do pet: ");
        String pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }
    
}