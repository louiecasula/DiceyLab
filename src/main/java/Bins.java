import java.util.ArrayList;

public class Bins {
    int min;
    int max;
    int[] possibleValues;
    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        this.possibleValues = new int[max - min  + 1];
    }

    public int getMin(){
        return this.min;
    }

    public int getMax(){
        return this.max;
    }

    public int getBin(int binNumber) {
        return this.possibleValues[binNumber - this.min];
    }

    public void incrementBin(int binNumber) {
        this.possibleValues[binNumber - this.min]++;
    }
}
