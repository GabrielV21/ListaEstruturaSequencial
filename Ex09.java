package listadeexercicio;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        float F = sc.nextFloat();
        float C = 5*((F-32)/9);
        System.out.printf("A temperatura em Celsius é: %.2f\n", C );
    }
}
