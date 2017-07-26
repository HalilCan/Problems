import java.util.ArrayList;
import java.util.Iterator;

public class primeFactorization {
    private ArrayList<Double> factors = new ArrayList<Double>();
    private ArrayList<Double> primes = new ArrayList<Double>();
    private Double maxPrime = 0.0;
    
    public primeFactorization () {
        maxPrime = 0.0;
        factors.clear();
        primes.clear();
    }

    
    public void setMaxPrime (Double d) {
        maxPrime = d;
    }
    
    public Double getMaxPrime () {
        Double d = 0.0;
        d = maxPrime;
        return d;
    }
    
    public boolean exists (Double d) {
        Iterator<Double> iter = primes.iterator();
        int l = primes.size();
        if (l < 1) {
            return true;
        }
        while (iter.hasNext()) {
            Double cur = iter.next();
            if (d % cur == 0.0) {
                return false;
            }
        }
        return true;
    }
    
    
    public void generatePrimeList () {
        Double i = 2.0;
        while (i < maxPrime) {
            if (exists(i)) {
                if(primes.size()==10000) {
                    System.out.println(i);
                }
                primes.add(i);
            }
            i+= 1.0;
        }
    }
    
    public Double findLargestPrime (Double d) {
        Double cur = 0.0;
        int len = primes.size();
        for (int i = 0; i < len; i++){
            Double g = primes.get(i);
            if (d%g == 0.0) {
                cur = g;
            }
        }
        return cur;
    }
    
    public void factorize (Double d) {
        Double cur = d;
        int len = primes.size();
        while (cur > 10.0) {
            for (int i = 0; i < len; i++) {
                Double div = primes.get(i);
                if (cur % div < 1.0 && cur % div > -1.0) {
                    factors.add(div);
                    cur = cur/div;
                }
                if (i == len-1 && !(cur % div < 1.0 && cur % div > -1.0)) {
                    factors.add(cur);
                }
            }  
        }
    }
    
    public ArrayList<Double> getFactors () {
        ArrayList<Double> dl = new ArrayList<Double>();
        dl = this.factors;
        return dl;
    }
    
    public ArrayList<Double> getPrimes () {
        ArrayList<Double> dl = new ArrayList<Double>();
        dl = this.primes;
        return dl;
    }
    
}
