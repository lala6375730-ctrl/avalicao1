import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a Temperatura em Celsius: ");

       if (!sc.hasNext()) {
           System.out.println("Digite um número real(ex: 25,0 ");
           sc.close();
           return;
       }

       double Celcius = sc.nextDouble();

       double Fahrenheit = (Celcius * 1.8) + 32.0;
       double Kelvin = (Celcius + 273.15);

        System.out.println();
        System.out.printf("Temperatura em Celsius: %.2f ºC\n", Celcius);
        System.out.printf("Temperatura em Fahrenheit: %.2f ºF\n", Fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f ºK\n", Kelvin);

    }
}
