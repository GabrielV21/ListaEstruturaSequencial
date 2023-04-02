package listadeexercicio;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quanto você ganha por hora: ");
        float salario = sc.nextFloat();
        System.out.println("Informe quantas horas você trabalha por mês; ");
        float horas = sc.nextFloat();
        System.out.println("Seu salário é: R$" + salario * horas);
    }
}
