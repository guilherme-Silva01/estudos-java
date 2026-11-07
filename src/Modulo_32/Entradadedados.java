package Modulo_32;

import java.util.Locale;
import java.util.Scanner;

public class Entradadedados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //.nextInt() numero inteiro
        //.next() texto
        //.nextDouble() flutuante
        //Para ler varios dados na mesma linha é necessario chamar cada um dos dados

        Scanner sc = new Scanner(System.in);
String x;
int y;
double z;

String nome = sc.next();
x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();


System.out.printf("os dados digitados foram %s %d %f%n" ,
        nome , y , z);


sc.close();

    }


}
