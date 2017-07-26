import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class primeSieveLimit {
    double limit = 0.0;
    TreeSet<Double> raws = new TreeSet<Double>();
    TreeSet<Double> mults = new TreeSet<Double>();
    TreeSet<Double> bases = new TreeSet<Double>();
    
    public primeSieveLimit (double lim) {
        limit = lim;
        genRaw();
        genMultSet();
    }
    
    public void genRaw () {
        for (Double d = 2.0; d < limit; d +=1.0 ) {
            raws.add(d);
        }
    }
    
    public void genMultSet () {
        for (Double d = 2.0; d < limit + 1.0; d += 1.0) {
            Double square = d*d;
            for (Double m = square; m < limit + 1.0; m *= d) {
                mults.add(m);
            }
        }
    }
    
    public TreeSet<Double> removeMults () {
        TreeSet<Double> working = duplicateTreeSet(raws);
        Iterator<Double> iterA = raws.iterator();        
        while (iterA.hasNext()) {
            Iterator<Double> iterB = raws.iterator();
            Iterator<Double> iterBB = raws.iterator();
            Double a = iterA.next();
            while (iterB.hasNext() && iterBB.next() < (limit+1)/a) {
                Double b = iterB.next();
                if (working.contains(a*b)) {
                    working.remove(a*b);
                }
            }
        }
        return working;
    }
    
    public TreeSet<Double> duplicateTreeSet (TreeSet<Double> ts) {
        Iterator<Double> iter = ts.iterator();
        TreeSet<Double> ns = new TreeSet<Double>();
        while (iter.hasNext()) {
            ns.add(iter.next());
        }
        return ns;
    }
    
    public Double multiplyTreeSet (TreeSet<Double> ts) {
        Iterator<Double> iter = ts.iterator();
        Double m = 1.0;
        while (iter.hasNext()) {
            m *= iter.next();
        }
        return m;
    }
    
    public Double sumTreeSet (TreeSet<Double> ts) {
        Iterator<Double> iter = ts.iterator();
        Double m = 1.0;
        while (iter.hasNext()) {
            m += iter.next();
        }
        return m;
    }
    
    public TreeSet<Double> getRaws () {
        return duplicateTreeSet(raws);
    }
    
    public TreeSet<Double> getMults () {
        return duplicateTreeSet(mults);
    }
    
    public TreeMap<Double, Integer> factors (Double d) {
        TreeSet<Double> primes = removeMults();
        TreeMap<Double, Integer> factors = new TreeMap<Double, Integer>();
        Double cur = d;
        Double check = cur;
        
        while (cur > 1.0) {
            Iterator<Double> iter = primes.iterator();
            check = cur;
            while (iter.hasNext() && cur == check) {
                Double n = iter.next();
                while (cur % n == 0.0) {
                    cur = cur / n;
                    if (factors.containsKey(n)) {
                        factors.put(n, factors.get(n) + 1);
                    } else {
                        factors.put(n, 1);
                    }
                }
            }
            if (check == cur) {
                factors.put(cur, 1);
                return factors;
            }
        }
        return factors;
    }
    
    public Integer factorCount (Double d) {
        TreeMap<Double, Integer> factors = factors(d);
        Integer fC = 1;

        for(Map.Entry<Double,Integer> factor : factors.entrySet()) {
            Integer value = factor.getValue();
            fC *= value + 1;
          }
        return fC;
    }
    
    public Double triangular (int factors) {
        Double triangle = 1.0;
        for (Double d = 2.0; d < 100000000000000000.0; d += 1.0) {
            triangle = triangle + d;
            System.out.println(triangle);
           int count = factorCount(triangle);
           if (count > factors) {
               return triangle;
            }
        }
        return 99.0;
    }
    
    public Double triangularLimit (Double lim) {
        Double triangle = 1.0;
        for (Double d = 2.0; d < lim; d++) {
            triangle = triangle + d;
            if (triangle > lim) {
                return triangle;
            }
        }
        return 2.0;
    }
}
