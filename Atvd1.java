import java.util.Scanner;

public class Atvd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota de 0 a 10: ");
        double nota = scanner.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Valor invalido!! Digite um valor entre 1 e 10: ");
            nota = scanner.nextDouble();      
        }   
        
        scanner.close();
    }
}