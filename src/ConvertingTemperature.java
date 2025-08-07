import java.util.Scanner;

public class ConvertingTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());
        double tc = (tf - 32) / 9 * 5;

        System.out.println("Temperatura em Celsius: " + tc);

        scanner.close();
    }
}