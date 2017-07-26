import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class fibonacciCheckerTest {

    @Test
    public void testTrivial() {
        fibonacciChecker fib = new fibonacciChecker();
        int[] range = {0, 10};
        TreeSet<Integer> fibonacciSet = new TreeSet<Integer>();
        fibonacciSet.add(2);
        fibonacciSet.add(3);
        fibonacciSet.add(5);
        fibonacciSet.add(8);
        
       
        fib.setRange(range);
        fib.setConditionNumerator(2);
        fib.generateSet();
        
        assertEquals(fibonacciSet, fib.getSet());
        assertEquals(fib.getCorrectedSum(), 10);
        assertEquals(fib.getCorrectedSum(), fib.genSetgetSum());
    }

    
    @Test
    public void testTrivial4Million() {
        fibonacciChecker fib = new fibonacciChecker();
        int[] range = {0, 4000000};  
       
        fib.setRange(range);
        fib.setConditionNumerator(2);
        fib.generateSet();
        
        System.out.println(fib.getCorrectedSum());
    }
}
