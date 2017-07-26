import static org.junit.Assert.*;

import org.junit.Test;

public class primeSieveLimitTest {

  // @Test
    public void testTrivial() {
        primeSieveLimit psl = new primeSieveLimit (100.0);
        System.out.println("Before:");
        System.out.println(psl.getRaws());
        System.out.println("After:");
        System.out.println(psl.removeMults());
    }
    
   // @Test
    public void testTrivial2() {
        primeSieveLimit psl = new primeSieveLimit (100.0);
        System.out.println("Before:");
        System.out.println(psl.getRaws());
        System.out.println("After:");
        System.out.println(psl.removeMults());
    }
    
  /*  @Test
    public void testQUESTION() {
        primeSieveLimit psl = new primeSieveLimit (2000000.0);
        System.out.println("Mult:");
        System.out.println(psl.sumTreeSet(psl.removeMults()));
    } */

    @Test
    public void testFactors() {
        primeSieveLimit psl = new primeSieveLimit (500.0);
        System.out.println("Mult:");
        System.out.println(psl.factors(76576500.0));
        System.out.println("FactorCount:");
        System.out.println(psl.factorCount(76576500.0));
    }
    

  /*  @Test
    public void testFactors2() {
        primeSieveLimit psl = new primeSieveLimit (2000000.0);
        System.out.println("Mult:");
        System.out.println(psl.factors(198668.0));
    } */
    
    @Test
    public void testFactorCount() {
        primeSieveLimit psl = new primeSieveLimit (10000.0);
        System.out.println("Mult:");
        System.out.println(psl.factors(50065021.0));
        System.out.println("FactorCount:");
        System.out.println(psl.factorCount(50065021.0));
    }
    
    @Test
    public void testFactorCount2() {
        primeSieveLimit psl = new primeSieveLimit (2000.0);
        System.out.println("Mult:");
        System.out.println(psl.factors(1970.0));
        System.out.println("FactorCount:");
        System.out.println(psl.factorCount(1970.0));
    }
    
    @Test
    public void testQuestion() {
        primeSieveLimit psl = new primeSieveLimit (100.0);
        System.out.println(psl.triangular(499));
    }
    
}
