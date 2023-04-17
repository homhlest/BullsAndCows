
/**
 * This class contains key logic of the game.
 */

public class Grader {
    private int bulls = 0;
    private int cows = 0;

    public Grader() {
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    /**
     * The method compares user input with a secret number.
     */

    public void countBullsAndCows(String[] code, String[] number) {
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (code[i].equals(number[j]) && i == j) {
                    bulls++;
                }
                if (code[i].equals(number[j]) && i != j) {
                    cows++;
                }
            }
        }
    }

    /**
     * This method outputs the results of each move and final result of the game.
     */

    public void printResult() {
        if (bulls == SecretNumber.NUMBER_LENGTH) System.out.println("Congrats! You have guessed the number.");
        if (bulls > 0 && cows > 0) System.out.printf("%d bull(s) and %d cow(s).\n", bulls, cows);
        if (bulls > 0 && cows == 0) System.out.printf("%d bull(s).\n", bulls);
        if (bulls == 0 && cows > 0) System.out.printf("%d cow(s).\n", cows);
        if (bulls == 0 && cows == 0) System.out.println("None.");
    }

    @Override
    public String toString() {
        return "Grader{" +
                ", counterBulls=" + bulls +
                ", counterCows=" + cows +
                '}';
    }
}
