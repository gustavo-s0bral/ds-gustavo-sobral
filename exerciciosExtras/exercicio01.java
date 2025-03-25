import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o nome da escala termometrica que você vai utilizar (EX: Celsius): ");
        String escala = scanner1.nextLine();
        System.out.println("Digite a temperatura (EX: 22,3): ");
        double temperatura = scanner1.nextDouble();
        
        double fahrenheit, kelvin, celsius, reaumur, rankine;

        scanner1.close();
        if (escala.equalsIgnoreCase("celsius")) {
            celsius = temperatura;
            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;
            reaumur = celsius * 0.8;
            rankine = celsius * 1.8 + 32 + 459.67;

            System.out.println("As temperaturas sao:\nCelsius (C): " + celsius + "\nFahrenheit (F): " + fahrenheit + "\nKelvin (K): " + kelvin + "\nReamur (Re): " + reaumur + "\nRankine (Ra): " + rankine);
        }
        if (escala.equalsIgnoreCase("fahrenheit")) {
            fahrenheit = temperatura;
            celsius = (fahrenheit - 32) / 1.8;
            kelvin = celsius + 273.15;
            reaumur = celsius * 0.8;
            rankine = celsius * 1.8 + 32 + 459.67;

            System.out.println("As temperaturas sao:\nCelsius (C): " + celsius + "\nFahrenheit (F): " + fahrenheit + "\nKelvin (K): " + kelvin + "\nReamur (Re): " + reaumur + "\nRankine (Ra): " + rankine);
        }
        if (escala.equalsIgnoreCase("kelvin")) {
            kelvin = temperatura;
            celsius = kelvin - 273.15;
            fahrenheit = celsius * 1.8 + 32;
            reaumur = celsius * 0.8;
            rankine = celsius * 1.8 + 32 + 459.67;

            System.out.println("As temperaturas sao:\nCelsius (C): " + celsius + "\nFahrenheit (F): " + fahrenheit + "\nKelvin (K): " + kelvin + "\nReamur (Re): " + reaumur + "\nRankine (Ra): " + rankine);
        }
        if (escala.equalsIgnoreCase("reamur")) {
            reaumur = temperatura;
            celsius = reaumur / 0.8;
            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;
            rankine = celsius * 1.8 + 32 + 459.67;

            System.out.println("As temperaturas sao:\nCelsius (C): " + celsius + "\nFahrenheit (F): " + fahrenheit + "\nKelvin (K): " + kelvin + "\nReamur (Re): " + reaumur + "\nRankine (Ra): " + rankine);
        }
        if (escala.equalsIgnoreCase("rankine")) {
            rankine = temperatura;
            celsius = (rankine - 32 - 459.67) * 1.8;
            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;
            reaumur = celsius * 0.8;

            System.out.println("As temperaturas sao:\nCelsius (C): " + celsius + "\nFahrenheit (F): " + fahrenheit + "\nKelvin (K): " + kelvin + "\nReamur (Re): " + reaumur + "\nRankine (Ra): " + rankine);
        }
        else{
            System.out.println("O nome digitado é inavalido");
        }
  }
}
