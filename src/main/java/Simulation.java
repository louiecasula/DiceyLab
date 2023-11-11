public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    Bins bins;
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
//        Dice dice = new Dice(numberOfDice);
//        Bins bins = new Bins(this.numberOfDice, this.numberOfDice * 6);

        for (int i = 0; i < this.numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.printf("Simulation of %d dice tossed for %,d times.\n", numberOfDice, numberOfTosses);
        System.out.println("***\n");

        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            int totalRolls = bins.getBin(i);
            float frequency = (float) totalRolls / numberOfTosses;
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < frequency * 100; j++) {
                sb.append("*");
            }
            String asterisk = sb.toString();
            System.out.printf("%2d : %,9d: %.2f %s\n", i, totalRolls, frequency, asterisk);
        }
    }
}
