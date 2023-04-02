package listadeexercicio;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;
        float nota[] = new float[4];
        for (i=0; i<4; i++){
            System.out.println("Informe a nota: ");
            nota[i] = sc.nextFloat();
          }
        System.out.println("A média das notas é: " + ((nota[0]+nota[1]+nota[2]+nota[3])/4) );
        
    } 
    
}
