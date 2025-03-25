import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Escreva um numero aleatório maior que 0: ");
        int n1 = scanner1.nextInt();
        scanner1.close();

        if (n1 > 0) {
            while (n1 > 0) {
                System.out.println(n1);

                n1 = n1 - 1;
            }
        }
        else{
            System.out.println("O numero e menor que 0.");
        }
    }
}
