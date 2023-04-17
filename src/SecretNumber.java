import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecretNumber {

    public static String[] generate() {
        Random random = new Random();
        String[] result = new String[4];
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            while (true) {
                int tempNumber = random.nextInt(10);
                if (!number.contains(tempNumber)) {
                    number.add(tempNumber);
                    result[i] = String.valueOf(tempNumber);
                    break;
                }
            }
        }
        return result;
    }
}
