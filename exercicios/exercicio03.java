import java.util.Scanner;

public class exercicio03 {//Linha declara o arquivo (mesmo nome do arquivo)
    public static void main(String[] args) {//Linha declara algumas caracteristicas principais do arquivo, public deixa ele publico, void não está esperando argumentos somente classe string
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("Digite o valor do lado a: ");
      double a = scanner1.nextDouble();

      Scanner scanner2 = new Scanner(System.in);
      System.out.println("Digite o valor do lado b: ");
      double b = scanner2.nextDouble();

      Scanner scanner3 = new Scanner(System.in);
      System.out.println("Digite o valor do lado c: ");
      double c = scanner3.nextDouble();

      if (a < b) {
        double valTemp = a;
        a = b;
        b = valTemp;
      }
      if (a < c) {
        double valTemp = a;
        a = c;
        c = valTemp;
      }
      if (b < c) {
        double valTemp = b;
        b = c;
        c = valTemp;
      }
      
      System.out.println("Lados ordenados em ordem decrescente:");
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      System.out.println("c: " + c);

      if (a > b + c) {
        System.out.println("Nao e um triangulo.");
      }
      else{
        if (a*a = b*b + c*c) {
          System.out.println("Ele e um triangulo retangulo.");
        }
        if (a*a > b*b + c*c) {
          System.out.println("Ele e um triangulo obtusangulo.");
        }
        if (a*a < b*b + c*c) {
          System.out.println("Ele e um triangulo acutangulo");
        }
        if (a == b && b == c) {
          System.out.println("Ele e um triangulo equilatero.");
        }
        if (a == b || b == c || a == c) {
          System.out.println("Ele e um triangulo isoceles.");
        }
      }
    }
  }