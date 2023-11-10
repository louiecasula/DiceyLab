import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDiceConstructor() {
        int numberOfDie = 2;
        Dice dice = new Dice(numberOfDie);

        Assert.assertNotNull(dice);
    }

    @Test
    public void testTossAndSum() {
        // Given
        int numberOfDie = 2;
        Dice dice = new Dice(numberOfDie);
        int max = numberOfDie * 6;

        // When
        int sum = dice.tossAndSum();

        // Then
        Assert.assertTrue(sum <= max && sum >= numberOfDie);
    }
}
