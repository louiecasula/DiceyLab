import java.util.Random;

public class Dice {
    int numberOfDie;
    public Dice(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    public int tossAndSum() {
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < this.numberOfDie; i++) {
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }
}
