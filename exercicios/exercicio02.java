import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Qual o seu sexo (digite masculino ou feminino): ");
        String sexo = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Qual seu código de Funcionario (EX: XXXXXX):");
        int codigoFunc = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite o seu tempo de trabalho (em anos): ");
        int tempoDeServico = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        Double salario = scanner3.nexDouble();

        scanner4.close();
        scanner3.close();
        scanner2.close();
        scanner1.close();

        double bonus = 0;
        if (sexo.equalsIgnoreCase("masculino") && tempoDeServico > 15) {
            bonus = (salario/100)*20;
        }
        if (sexo.equalsIgnoreCase("feminino") && tempoDeServico > 10) {
            bonus = (salario/100)*25;
        }
        else{
            bonus = 100;
        }
        double salComBonus = salario+bonus;

        System.out.println("Olá funcionário código " + codigoFunc + ", o seu salario antigo era de: R$ " + salario + ("\nAgora com bonus seu salario ficara: R$ " + salComBonus));
        
    }
}
