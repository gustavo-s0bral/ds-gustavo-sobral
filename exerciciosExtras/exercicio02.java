import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escreva um numero aleatório maior que 0: ");
        int n1 = scanner1.nextInt();
        System.out.println("Escolha se você quer em ordem crescente, decrescente ou ambas: ");
        String ordem = scanner1.next();
        scanner1.close();

        if (n1 > 0) {
            if (ordem.equalsIgnoreCase("decrescente")) {
                System.out.println("\nOrdem decrescente: ");

                while (n1 >= 0) {
                    System.out.println(n1);
    
                    n1 = n1 - 1;
                }
            }
            if (ordem.equalsIgnoreCase("crescente")) {
                System.out.println("\nOrdem crescente");
                
                for (int i = 0; i < n1; i++) {
                    System.out.println(i);
                }
            }
            if (ordem.equalsIgnoreCase("ambas")) {
                System.out.println("\nOrdem decrescente: ");

                int temp = n1;
                while (n1 >= 0) {
                    System.out.println(n1);
    
                    n1 = n1 - 1;
                }

                n1 = temp;
                System.out.println("\nOrdem crescente: ");
                
                for (int i = 0; i < n1; i++) {
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("O numero e menor que 0.");
        }
    }
}
