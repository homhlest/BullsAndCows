
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class generates 4-digit number (each digit is different).
 */

public class SecretNumber {

    public static final int NUMBER_LENGTH = 4;

    /**
     * Method uses Random generator and generates 4-digit secret number.
     * The number is stored in the String[].
     *
     * @return String[] with 4-digit number
     */

    public static String[] generate() {
        Random random = new Random();
        String[] result = new String[4];
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            while (true) {
                int tempNumber = random.nextInt(10);
                if (!number.contains(tempNumber)) {
                    number.add(tempNumber);
                    result[i] = String.valueOf(tempNumber);
                    break;
                }
            }
        }
        System.out.println("The 4-digit secret number has been generated. Let's start!");
        return result;
    }
}
