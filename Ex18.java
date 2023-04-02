package listadeexercicio;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo em MB: ");
        float tmhmb = sc.nextFloat();
        System.out.println("Informe a velocidade da Internet em Mbps: ");
        float netvlc = sc.nextFloat();
        float tempo = (tmhmb*8)/netvlc;
        System.out.println("O tempo aproximado de download é de: "+ tempo/60 +" minutos");
    }
}
