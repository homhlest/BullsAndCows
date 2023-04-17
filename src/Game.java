
import java.util.Arrays;

/**
 * This class is responsible for the game as a whole.
 */

public class Game {
    public static final long PERMITTED_DURATION = 60_000; // 60 seconds for one game

    public static void start() throws InterruptedException {
        String[] secretCode = SecretNumber.generate();
        Grader g1 = new Grader();
        long startTime = System.currentTimeMillis();
        while (true) {
            long endTime = System.currentTimeMillis();
            if ((endTime - startTime) > PERMITTED_DURATION) {
                System.out.println("Game over! You lost!");
                break;
            }
            String[] number = Input.check();
            if (Arrays.equals(secretCode, number)) {
                System.out.println("Congrats! You have guessed the secret number.");
                break;
            }
            g1.countBullsAndCows(secretCode, number);
            g1.printResult();
            g1.setBulls(0);
            g1.setCows(0);
        }
        System.out.print("The secret code is: ");
        Arrays.stream(secretCode).forEach((String) -> System.out.print(String));
    }
}
