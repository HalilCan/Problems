import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class palindromeFinderTest {

    @Test
    public void testTrivial() {
        palindromeFinder p = new palindromeFinder();
        assertTrue(p.palCheck(1));
        assertTrue(p.palCheck(11));
        assertTrue(p.palCheck(111));
        assertTrue(p.palCheck(1111));
        assertTrue(p.palCheck(2));
        assertTrue(p.palCheck(22));
        assertTrue(p.palCheck(121));
        assertTrue(p.palCheck(1221));
        assertTrue(p.palCheck(2));
        assertFalse(p.palCheck(23));
        assertFalse(p.palCheck(133));
        assertFalse(p.palCheck(1231));
    }
    
    @Test
    public void testGenTrivial() {
        palindromeFinder p = new palindromeFinder();
        p.genListCorrected(10,100);
        TreeSet<Integer> t = p.getSet();
        System.out.println(t);
    }
    
    @Test
    public void testEfficientTrivial() {
        palindromeFinder p = new palindromeFinder();
        assertTrue(p.threeDigitDivisorsCheck(10201));
    }
    
    @Test
    public void testEfficientQuastion() {
        palindromeFinder p = new palindromeFinder();
        p.palLister(10000, 1000000);
        int n = p.getLargestThreeDigitMultiple();
        System.out.println(n);
    }

}
