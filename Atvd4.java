import java.util.Scanner;

public class Atvd4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        while(contador < 5){
            System.out.println("Digite os 5 números, " + (contador+1) + "° número.");
            double numeros = scanner.nextDouble();
            soma += numeros;
            contador++;
        }
        
        double media = (soma) / 5;
        
        System.out.println("A média dos números é: " + media);

        scanner.close();


    }
}
