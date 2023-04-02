package listadeexercicio;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso da pesca: ");
        float pesopesca = sc.nextFloat();
        
        if (pesopesca>50){
            float excesso = pesopesca-50;
            float multa = excesso*4;
            System.out.println("O peso em excesso é de: " + excesso);
            System.out.println("E o valor da multa é de: " + multa);
        } else {
            System.out.println("O peso da pesca está dentro do permitido!");
        }
    }
}
