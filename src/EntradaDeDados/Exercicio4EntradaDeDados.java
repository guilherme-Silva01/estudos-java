package EntradaDeDados;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4EntradaDeDados {
    public static void main(String[] args) {
//esse programa lê o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais


                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                String nome;
                int horas;
                double valorHora, salario;

                System.out.println("Digite Seu Nome");
                nome = sc.nextLine();

                System.out.println("Digite A QuantiDade De Horas Trabalhadas");
                horas = sc.nextInt();

                System.out.println("Digite o valor da hora trabalhada");
                valorHora = sc.nextDouble();

                salario = valorHora * horas;

                System.out.println("Name = " + nome);
                System.out.printf("Salary = U$ %.2f%n", salario);

                sc.close();
            }
        }


