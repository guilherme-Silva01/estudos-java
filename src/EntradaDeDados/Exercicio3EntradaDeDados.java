package EntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3EntradaDeDados {
    public static void main(String[] args) {

//o programa lê o valor do raio de um círculo, e depois mostra o valor da área deste círculo com quatro
// casas decimais


                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double R, A, pi = 3.14159;

                R = sc.nextDouble();

                A = pi * R * R;

                System.out.printf("A= %.4f%n", A);

                sc.close();
            }
        }

