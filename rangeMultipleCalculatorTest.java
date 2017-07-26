import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class rangeMultipleCalculatorTest {

    
    @Test
    public void test1() {
        rangeMultipleCalculator rmc = new rangeMultipleCalculator();
        rmc.tft();
        TreeSet<Integer> expectedMults = new TreeSet<Integer>();
        expectedMults.add(0);
        expectedMults.add(3);
        expectedMults.add(5);
        expectedMults.add(6);
        expectedMults.add(9);
        int expectedSum = 23;
        
        assertEquals(rmc.getMin(), 0);
        assertEquals(rmc.getMax(), 10);
        assertEquals(rmc.getMults(), expectedMults);
        assertEquals(rmc.getSum(), expectedSum);
        
    }
    
    @Test
    public void mult3and5from0to100() {
        rangeMultipleCalculator rmc = new rangeMultipleCalculator();
        int[] range = {0, 100};
        ArrayList<Integer> numerators = new ArrayList<Integer>();
        numerators.add(3);
        numerators.add(5);
        rmc.setRange(range);
        rmc.insertNum(numerators);
        rmc.multipleListGen();
        System.out.println(rmc.getMults());
    }
    
    @Test
    public void mult3and5from0to1000() {
        rangeMultipleCalculator rmc = new rangeMultipleCalculator();
        int[] range = {0, 1000};
        ArrayList<Integer> numerators = new ArrayList<Integer>();
        numerators.add(3);
        numerators.add(5);
        rmc.setRange(range);
        rmc.insertNum(numerators);
        rmc.multipleListGen();
        System.out.println(rmc.getSum());
    }

}
