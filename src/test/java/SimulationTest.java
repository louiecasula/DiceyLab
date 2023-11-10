import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SimulationTest extends TestCase {
    @Test
    public void testSimulationConstructor() {
        int numberOfDice = 2;
        int numberOfTosses = 10;
        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);

        Assert.assertNotNull(simulation);
    }

    @Test
    public void testRunSimulation() {
//        int numberOfDice = 2;
//        int numberOfTosses = 10;
//        Simulation simulation = new Simulation(numberOfDice, numberOfTosses);
//
//        Assert.assertNotNull(simulation);
    }
}