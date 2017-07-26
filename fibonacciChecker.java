    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.TreeSet;

public class fibonacciChecker {
        private int conditionNum = 0;
        private TreeSet<Integer> numSet = new TreeSet<Integer>();
        private int min = 0;
        private int max = 0;
        
        public fibonacciChecker () {
            conditionNum = 0;
        }
        
        public void setRange(int[] range){
            min = range[0];
            max = range[1];
        }
        
        public int getMin () {
            int a = 0;
            a = min;
            return a;
        }
        
        public int getMax () {
            int a = 0;
            a = max;
            return a;
        }
      
        public void setConditionNumerator(int i) {
            conditionNum = i;
        }
        
        public void generateSet () {
            int cur = 1;
            int prev = 1;
            
            do {
                cur = prev + cur;
                prev = cur - prev;
            } while (cur < min);
            
            while (cur < max) {
                numSet.add(cur);
                cur = prev + cur;
                prev = cur - prev;
            }
        }
        
        public TreeSet<Integer> getSet () {
            TreeSet<Integer> re = new TreeSet<Integer>();
            re = this.numSet;
            return re;
        }
        
        public int getCorrectedSum (){
            Iterator<Integer> iter = numSet.iterator();
            int sum = 0;
            while (iter.hasNext()) {
                int cur = iter.next();
                if (cur % conditionNum == 0) {
                    sum = sum + cur;
                }  
            }
            return sum;
        }
        
        public int genSetgetSum () {
            int cur = 1;
            int prev = 1;
            int sum = 0;
            
            do {
                cur = prev + cur;
                prev = cur - prev;
            } while (cur < min);
            
            while (cur < max) {
                numSet.add(cur);
                if (cur % conditionNum == 0) {
                    sum = sum + cur;
                } 
                cur = prev + cur;
                prev = cur - prev;
            }
            return sum;
        }
        
}
