package listadeexercicio;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Short num1, num2;
        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextShort();
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextShort();
        System.out.println("A soma dos dois numeros informados foi: " + (num1+num2));
    }
}
