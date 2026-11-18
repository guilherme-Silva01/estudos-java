package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

//Desafio em andamento... falta finalizar
public class DesafioIfElse {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor da compra");
        double valorCompra = sc.nextDouble();
        if (valorCompra <= 0) {
            System.out.println("Valor de Compra invalido");
            sc.close();
            return;

        }

        System.out.println("você é cliente Vip? S ou N");
        // Se NÃO for "S" E NÃO for "N", barra na hora
        String vip = sc.next();
        if (!vip.equalsIgnoreCase("S") && !vip.equalsIgnoreCase("N")) {
            System.out.println("Dados Inválidos Digite apenas S ou N");
            sc.close();
            return;
        }


        System.out.println("Qual a distancia de entrega?");
        int distanciaKm = sc.nextInt(); //Se a distancia for igual ou menor que 0 ira barrar na hora

        if (distanciaKm <= 0) {
            System.out.println("Dados inválidos para o pedido, digite o valor correto da distancia.");
            sc.close(); // Importante: fecha o Scanner antes de encerrar
            return;// O programa morre aqui. Se entrar nesse if, nada abaixo roda.
        }

        if (valorCompra >= 200.0 || vip.equalsIgnoreCase("S")) {
            System.out.println("frete Gratis!!");
        }
        double desconto = 0.0;
        if (vip.equalsIgnoreCase("S") && valorCompra > 300.0) {
          desconto = valorCompra * 0.10;

          double valorTotal = valorCompra - desconto +
        }
        double Valorfrete =
    }
}




