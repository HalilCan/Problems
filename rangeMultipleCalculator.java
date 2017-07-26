import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;


public class rangeMultipleCalculator {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    TreeSet<Integer> mults = new TreeSet<Integer>();
    int min = 0;
    int max = 0;
    
    public rangeMultipleCalculator () {
        nums.clear();
    }
    
    public void insertNum(ArrayList<Integer> input) {
        if ( input.size() > 0 ) {
            Iterator<Integer> iter = input.iterator();
            while(iter.hasNext()) {
                nums.add(iter.next());
            }
        }
    }
    
    public void setRange(int[] range){
        if (range[1] <= range[0]) {
            throw new RuntimeException();
        }
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
    
    public void multipleListGen() {
       for (int j = 0; j < nums.size(); j++){
           for (int i = min; i < max ; i++)
           {
               if (i % nums.get(j) == 0) {
                   mults.add(i);
               }
           }
       }
    }
   
    public TreeSet<Integer> getMults() {
        TreeSet<Integer> m = mults;
        return m;
    }
    
    public int getSum () {
        TreeSet<Integer> m = mults;
        int sum = 0;
        Iterator<Integer> iter = m.iterator();
        while (iter.hasNext()) {
            sum = sum + iter.next();
        }
        return sum;
    }
    
    public void tft () {
        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(3);
        in.add(5);
        int max2 = 10;
        int min2 = 0;
        int[] minMax = new int[2];
        minMax[0] = min2;
        minMax[1] = max2;
        insertNum(in);
        setRange(minMax);
        multipleListGen();
        System.out.println(mults);
    }
}
