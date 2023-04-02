package listadeexercicio;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        float h = sc.nextFloat();
        System.out.println("Informe seu sexo: Mulher ou Homem ");
        String sexo = sc.next();
        float pi1 = (float) 72.7*h-58;
        float pi2 = (float) ((float) 62.1*h-44.7);
        switch (sexo) {
            case "Mulher": System.out.printf("O seu peso ideal é: %.2f\n", pi1);
                break;
            case "Homem": System.out.printf("O seu peso ideal é: %.2f\n", pi2);
                break;
            default: System.out.println("Você é não-binárie");
        }
    }
}
    