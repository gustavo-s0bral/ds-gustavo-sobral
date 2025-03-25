import java.util.Scanner;

class exercicio01{
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Qual o seu nome:");
        String name = scanner1.nextLine();
        

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o total de horas trabalhadas:");
        int horasTrab = scanner2.nextInt();
        

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite o salario recebido por hora:");
        double salarioPorHora = scanner3.nextDouble();
        

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Digite o numero de filhos que tem menos de 14 anos:");
        int numeroDeFilhos = scanner4.nextInt();
        
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner5.nextInt();

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Digite o seu tempo de serviço:");
        int tempoDeServico = scanner6.nextInt();

        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Digite o valor do salario familia:");
        int salFamilia = scanner7.nextInt();

        scanner7.close();
        scanner5.close();
        scanner4.close();
        scanner3.close();
        scanner2.close();
        scanner1.close();

        double salBruto = (horasTrab*salarioPorHora)*4;
        double INPS = (salBruto/100)*8.5;
        double salFamiliaTotal = salFamilia*numeroDeFilhos;

        if (salBruto > 1500) {
            double ir = (salBruto/100)*15;
            
            if (idade > 40) {
                double adicional = (salBruto/100)*2;
            }
            if (tempoDeServico > 15) {
                double adicional = (salBruto/100)*3.5;
            }
            if (15 >= tempoDeServico && tempoDeServico > 5 && idade > 30) {
                double adicional = (salBruto/100)*1.5;                
            }
        }

        if (500 < salBruto && salBruto < 1500) {
            double ir = (salBruto/100)*8;

            if (idade > 40) {
                double adicional = (salBruto/100)*2;
            }
            if (tempoDeServico > 15) {
                double adicional = (salBruto/100)*3.5;
            }
            if (15 >= tempoDeServico && tempoDeServico > 5 && idade > 30) {
                double adicional = (salBruto/100)*1.5;                
            }
        }
        if (500 > salBruto) {
            ir = 0;

            if (idade > 40) {
                double adicional = (salBruto/100)*2;
            }
            if (tempoDeServico > 15) {
                double adicional = (salBruto/100)*3.5;
            }
            if (15 >= tempoDeServico && tempoDeServico > 5 && idade > 30) {
                double adicional = (salBruto/100)*1.5;                
            }
        }
        double desconto = salBruto - ir;
        double adicionalTotal = salFamiliaTotal + adicional;
        double salLiquido = desconto + adicionalTotal;
        

        System.out.println("Olá " + name + ", o seu salario bruto é de: R$" + salBruto + "\nO total de descontos foi: R$ " + ir + "\nO total de adicional foi: R$ " + adicionalTotal + "\nO salario liquido é de: R$" + salLiquido);
    }
}