import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void start() {
        String[] secretCode = SecretNumber.generate();
        System.out.println("I made up a number. Try to guess it.");
        Scanner sc = new Scanner(System.in);

        Grader g1 = new Grader();
        while (true) {

            String[] number = Input.check();

            if (Arrays.equals(secretCode, number)) {
                System.out.println("Congrats! You have guessed the code.");
                break;
            }
            g1.countBullsAndCows(secretCode, number);
            g1.printResult();
            g1.setCounterBulls(0);
            g1.setCounterCows(0);
        }
        System.out.print("The secret code is: ");
        Arrays.stream(secretCode).forEach((String) -> System.out.print(String));
    }
}
