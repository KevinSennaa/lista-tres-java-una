import java.util.Scanner;

public class Atvd7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contadorPar = 0;
        int contadorImpar = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "° número. ");
            int numeros = scanner.nextInt();
            if( numeros % 2 == 0){
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
    
        System.out.println("Quantidade de números par é: " + contadorPar);
        System.out.println("Quantidade de números impar é: " + contadorImpar);

        scanner.close();
    
    }
    
}
