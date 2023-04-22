import java.util.Scanner;

public class Atvd2 {
    public static void main(String[] args) {
        String nome, senha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        
        System.out.println("Digite a senha: ");
        senha = scanner.next();

        while (senha.equals(nome)) {
            System.out.println("Senha inválida. A senha não pode ser igual ao nome de usuário.");
            senha = scanner.next();
        } 
       
        System.out.println("Bem vindo! " + nome);

        scanner.close();

        
    }
}
