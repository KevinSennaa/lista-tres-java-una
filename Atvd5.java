import java.util.Scanner;

public class Atvd5 {
    public static void main(String[] arhs) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
              System.out.println(i);
            }
        }
        
        scanner.close();
    }
    
}
