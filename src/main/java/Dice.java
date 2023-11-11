import java.util.Random;

public class Dice {
    private int numberOfDice;
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }
    public int tossAndSum() {
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < this.numberOfDice; i++) {
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }
}
