import java.util.ArrayList;

public class largestProductInASeries {
    private int size = 0;
    private ArrayList<Integer> input = new ArrayList<Integer>();
    
    public largestProductInASeries (String s) {
        size = s.length();
        
        for (int i = 0; i < size; i++) {
            String d = String.valueOf(s.charAt(i));
            int id = Integer.valueOf(d);
            input.add(id);
        }
    }
    
    public double[][] productFind (int len) {
        double [][] pArr = new double[size][len];
        
        for (int j = 0; j < size; j++) {
            pArr[j][0] = (double)input.get(j);
            pArr[j][0] = (double)input.get(j);
        }
        
        for (int i = 0; i < size; i++) {
            for (int k = 1; k < len; k ++) {
                if (size - (i+k) > 0) {
                    pArr[i][0] = pArr[i][0] * pArr[i+k][0];
                    pArr[i][k] = pArr[i+k][0];
                }
            }
        }
        return pArr;
    }
    
    public ArrayList<Double> largest (double[][] pArr, int desired_size) {
        int len = pArr.length;
        ArrayList<Double> serie = new ArrayList<Double>();
        double cur = 0;  
        
        for (int i = 0; i < len; i++) {
            if (pArr[i][0] > cur) {
                serie.clear();
                cur = pArr[i][0];
            }
            if (serie.size() < desired_size) {
                serie.add((double)input.get(i));
            }
        }
        return serie;
    }
    
    public double multArrL (ArrayList<Double> arl) {
        int len = arl.size();
        double cur = 1;
        for (int i = 0; i < len; i++) {
            cur = cur * arl.get(i);
        }
        return cur;
    }
}
