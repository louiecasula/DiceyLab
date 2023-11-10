public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        Dice dice = new Dice(this.numberOfDice);
        Bins bins = new Bins(this.numberOfDice, this.numberOfDice * 6);

        for (int i = 0; i < this.numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        System.out.println();
    }
}
