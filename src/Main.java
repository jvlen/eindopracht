import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een geheel positief getal:");
        int input = sc.nextInt();

        int even = 0;
        int oneven = 0;

        for (int i = 0; i <= input; i++) {
            if (i % 2 == 0) {
                even = (even + i);
            } else {
                oneven = (oneven + i);
            }
        }

        System.out.println("Som van even getallen tot en met " + input + " is " + even);
        System.out.println("Som van oneven getallen tot en met " + input + " is " + oneven);
        System.out.println("Verschil tussen twee sommen is " + (even - oneven));
    }


}
