import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class primeFactorizationTest {

     @Test
    public void test() {
        primeFactorization p = new primeFactorization();  
        p.setMaxPrime(100000.0);
        p.generatePrimeList();
        
        System.out.println(p.getPrimes());
        
        p.factorize(13195.0);
        System.out.println(p.getFactors());
        
        System.out.println(p.findLargestPrime(13195.0));
        
        System.out.println(p.findLargestPrime(600851475143.0));
    }
    
    
    @Test
    public void testQuestion5() {
        primeFactorization p = new primeFactorization();  
        p.setMaxPrime(21.0);
        p.generatePrimeList();
        
        ArrayList<Double> ad = p.getPrimes();
        
        Double mult = 1.0;
        
        for (int i = 0; i < ad.size(); i++){
            System.out.println(ad.get(i));
            mult *= ad.get(i);
            System.out.println(mult);
        }
        
        Double corrector = 8.0 * 3.0;
        mult = mult * corrector;
        System.out.println(mult);
    }
    
    @Test
    public void testQuestion10() {
        primeFactorization p = new primeFactorization();  
        p.setMaxPrime(20000000.0);
        p.generatePrimeList();
        
        ArrayList<Double> ad = p.getPrimes();
        
        Double sum = 0.0;
        
        for (int i = 0; i < ad.size(); i++){
            System.out.println(ad.get(i));
            sum += ad.get(i);
            System.out.println(sum);
        }
        
        System.out.println(sum);
    }

}
