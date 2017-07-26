import static org.junit.Assert.*;

import org.junit.Test;

public class sumSquareDiffTest {

    @Test
    public void testTrivial() {
        sumSquareDiff s = new sumSquareDiff();
        s.setRange(1, 10);
        s.calc();
        int diff = s.getDifference();
        assertEquals(2640, diff);
        }

    @Test
    public void testAns() {
        sumSquareDiff s = new sumSquareDiff();
        s.setRange(1, 100);
        s.calc();
        int diff = s.getDifference();
        System.out.println(diff);
        }
}
