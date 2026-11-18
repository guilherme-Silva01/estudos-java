package EntradaDeDados;
import java.util.Scanner;

public class Exercicio2EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma , multi, sub;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;
        sub = A - B;
        multi =  A * B;

        System.out.println("SOMA = " + soma);
        System.out.println("multiplicação =" + multi);
        System.out.println("subtração " + sub);

        sc.close();




    }
}
