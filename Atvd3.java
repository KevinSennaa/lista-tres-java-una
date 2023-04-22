import java.util.Scanner;

public class Atvd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome; 
        int idade;
        double salario;
        char estadoCivil, sexo;
        
        do{
            System.out.println("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.next();
        } while (nome.length()<= 3);

        do{
            System.out.println("Digite a sua idade entre 0 a 150: ");
            idade = scanner.nextInt();
        }while (idade < 0 || idade > 150);

        do{
            System.out.println("Digite o sálario:");
            salario = scanner.nextDouble();
        }while(salario <= 0);

        
            System.out.println("Digite seu sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
                System.out.println("Informe um sexo válido!! Sexo:");
                sexo = scanner.next().charAt(0);
            }
        
            System.out.println("Estado Civil('s', 'c', 'v', 'd'): ");
            estadoCivil = scanner.next().charAt(0);
        while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd' ){
            System.out.println("Informe um Esatado Civil válido!! Estado Civil: ");
            estadoCivil = scanner.next().charAt(0);
        }   

        scanner.close();

    }
}
