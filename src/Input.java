import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Input {

    public static String[] check(){
        Scanner sc = new Scanner(System.in);
        String[] number = sc.nextLine().split("");
        while (!isDigitsAllDifferent(number)) {
            System.out.println("The digits must be all different.");
            number = sc.nextLine().split("");
        }
        return number;
    }


    public static boolean isDigitsAllDifferent(String[] input) {
        Set<String> checker = new HashSet<>(Arrays.asList(input));
        return checker.size() == 4;
    }
}
