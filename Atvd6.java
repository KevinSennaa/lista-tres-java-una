import java.util.Scanner;

public class Atvd6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            

            System.out.println("Digite o primeiro número do contador: ");
            int numeroUm = scanner.nextInt();
            System.out.println("Digite o segundo número do contador: ");
            int numeroDois = scanner.nextInt(); 
            
            for(int i = numeroUm; i<= numeroDois; i++){
                System.out.println("Números: " + i);
            }
            scanner.close();
        }
    }
    

