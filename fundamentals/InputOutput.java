
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        // Input
        // open / initialize scanner
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // Output
        System.out.println("Hi " + name + "!");

        // close / terminate scanner
        sc.close();
    }
}
