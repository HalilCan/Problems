import java.util.ArrayList;
import java.util.TreeSet;

public class palindromeFinder {
    private boolean initialized = false;
    private TreeSet<Integer> nums = new TreeSet<Integer>();
    private ArrayList<Integer> numsArray = new ArrayList<Integer>();
    public palindromeFinder () {
        initialized = true;
    }
    
    public boolean palCheck (int i) {
        String num = Integer.toString(i);
        int len = num.length();
        
        if (len % 2 == 0) {
            for (int k = 0; k < len/2; k++) { 
                if (num.charAt(k) != num.charAt(len-1-k)) {
                    return false;
                }
            }
            return true;
        }
        else {
            for (int k = 0; k < (len-1)/2; k++) { 
                if (num.charAt(k) != num.charAt(len-1-k)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    
    public void genListCorrected (int min, int max) {
        for (int i = min; i<max; i++) {
            for (int k = min; k < max; k++) {
                int n = i * k;
                if (palCheck(n) == true) {
                    nums.add(n);
                }
            }
        }  
    }
    
    public int lastGet () {
        int k = nums.last();
        return k;
    }
    
    public TreeSet<Integer> getSet () {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t = nums;
        return t;
    }
    
    
    
    public void palLister (int min, int max) {
        for (int i = min; i < max; i++) {
            if (palCheck (i) == true) {
                numsArray.add(i);
            }
        }
    }
    
    
    public boolean threeDigitDivisorsCheck (int n) {
        for (int i = 100; i < 1000; i++) {
            if (n % i == 0) {
                int k = n / i;
                String num = Integer.toString(k);
                if (num.length() == 3) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int getLargestThreeDigitMultiple () {
        int len = numsArray.size();
        for (int i = len - 1; i > 0; i --) {
            int num = numsArray.get(i);
            if (threeDigitDivisorsCheck(num) == true) {
                return num;
            }
        }
        return 0;
    }
    
}
