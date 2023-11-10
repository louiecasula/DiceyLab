import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BinsTest extends TestCase {
    @Test
    public void testBinsConstructor() {
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);

        Assert.assertNotNull(bins);
    }

    @Test
    public void testGetBins() {
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);

        int expected = 0;
        int actual = bins.getBin(7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBins() {
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        int binNumber = 8;

        bins.incrementBin(binNumber);
        int expected = 1;
        int actual = bins.getBin(binNumber);

        Assert.assertEquals(expected, actual);
    }
}