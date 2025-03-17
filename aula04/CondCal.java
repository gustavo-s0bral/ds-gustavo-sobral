import java.util.Scanner;

public class CondCal {
    public static void main (String [] args){
        Scanner v1 = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int n1 =v1.nextInt();
        Scanner v2 = new Scanner(System.in);
        System.out.println("Escolha outro numero: ");
        int n2 =v2.nextInt();

        v1.close();
        v2.close();
        if (n1 > n2) {
            System.out.println(n1 + " e maior que " + n2);
        }
        else if (n1 == n2) {
            System.out.println(n1 + " e igual a " + n2);
        }
        else {
            System.out.println(n2 + " e maior que " + n1);
        }
    }
}