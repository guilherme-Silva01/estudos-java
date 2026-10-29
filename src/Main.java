 import java.util.Locale;

public class main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Eu te amo mari ");
        String nome = "jorge";
        int idade = 35;
        double salario = 3014.66;
       System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);



    }
}
