public class Grader {
    private int bulls;
    private int cows;
    private int counterBulls = 0;
    private int counterCows = 0;

    public Grader() {
    }

    public Grader(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
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

    public int getCounterBulls() {
        return counterBulls;
    }

    public void setCounterBulls(int counterBulls) {
        this.counterBulls = counterBulls;
    }

    public int getCounterCows() {
        return counterCows;
    }

    public void setCounterCows(int counterCows) {
        this.counterCows = counterCows;
    }

    public void countBullsAndCows(String[] code, String[] number) {
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (code[i].equals(number[j]) && i == j) {
                    counterBulls++;
                }
                if (code[i].equals(number[j]) && i != j) {
                    counterCows++;
                }
            }
        }
    }

    public void printResult() {
        if (counterBulls == 4) {
            System.out.println("Congrats! You have guessed the number.");
        }
        if (counterBulls > 0 && counterCows > 0) {
            System.out.printf("Grade: %d bull(s) and %d cow(s).\n", counterBulls, counterCows);
        }
        if (counterBulls > 0 && counterCows == 0) {
            System.out.printf("Grade: %d bull(s).\n", counterBulls);
        }
        if (counterBulls == 0 && counterCows > 0) {
            System.out.printf("Grade: %d cow(s).\n", counterCows);
        }
        if (counterBulls == 0 && counterCows == 0) {
            System.out.println("Grade: None.");
        }
    }

    @Override
    public String toString() {
        return "Grader{" +
                "bulls=" + bulls +
                ", cows=" + cows +
                ", counterBulls=" + counterBulls +
                ", counterCows=" + counterCows +
                '}';
    }
}
