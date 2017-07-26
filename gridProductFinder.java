import java.util.ArrayList;

public class gridProductFinder {
    int x_span = 0;
    int y_span = 0;
    int size = 0;
    ArrayList<Double[]> grid = new ArrayList<Double[]>();
    ArrayList<Double> max = new ArrayList<Double>();
    String dir = "";
    
    //check for invariants in the browse functions
    //compare array[size] elements
    
    public void setSpan (int x, int y) {
        x_span = x;
        y_span = y;
    }
    
    public void setSearchSize (int i) {
        size = i;
    }
    
    public gridProductFinder (int x, int y, int i) {
        setSpan(x,y);
        setSearchSize(i);
        max.add(0.0);
    }
    
    public void addRow (Double[] d) {
        grid.add(d);
    }
    
    public Double[] hMult (int x, int y) {
        Double mult = 1.0;
        Double[] row = grid.get(y);
        Double[] set = new Double[size+1];
        for (int i = x; i < x + size; i++) {
            set[i-x] = (double)row[i];
            mult *= row[i];
        }
        set[size] = mult;
        if (mult > max.get(0)) {
            max.clear();
            max.add(mult);
            for (int z = 0; z < set.length-1; z++) {
                max.add(set[z]);
            }
            dir = "Horizontal";
        }
        return set;
    }
    
    public Double[] vMult (int x, int y) {
        Double mult = 1.0;
        Double[] set = new Double[size+1];
        for (int i = y; i < y + size; i++) {
            set[i-y] = (double)grid.get(i)[x]; 
            mult *= grid.get(i)[x];
        }
        set[size] = mult;
        if (mult > max.get(0)) {
            max.clear();
            max.add(mult);
            for (int z = 0; z < set.length-1; z++) {
                max.add(set[z]);
            }
            dir = "Vertical";
        }
        return set;
    }
    
    public Double[] dLMult (int x, int y) {
        Double mult = 1.0;
        Double[] set = new Double[size+1];
        for (int i = y; i < y + size; i++) {
            set[i-y] = (double)grid.get(i)[x-(i-y)];
            mult *= grid.get(i)[x-(i-y)];
        }
        set[size] = mult;
        if (mult > max.get(0)) {
            max.clear();
            max.add(mult);
            for (int z = 0; z < set.length-1; z++) {
                max.add(set[z]);
            }
            dir = "Left falling diagonal";
        }
        return set;
    }
    
    public Double[] dRMult (int x, int y) {
        Double mult = 1.0;
        Double[] set = new Double[size+1];
        for (int i = y; i < y + size; i++) {
            set[i-y] = (double)grid.get(i)[x+(i-y)];
            mult *= grid.get(i)[x+(i-y)];
        }
        set[size] = mult;
        if (mult > max.get(0)) {
            max.clear();
            max.add(mult);
            for (int z = 0; z < set.length-1; z++) {
                max.add(set[z]);
            }
            dir = "Right falling diagonal";
        }
        return set;
    }
    
    public void findGreatestMultiple () {
        
        for (int i = 0; i < x_span; i++) {
            for (int j = 0; j < y_span; j++) {
                //System.out.println(grid.get(i)[j]);
                Double[] ver = new Double[size+1];
                Double[] hor = new Double[size+1];
                Double[] dr = new Double[size+1];
                Double[] dl = new Double[size+1];
                ver[size] = 0.0;
                hor[size] = 0.0;
                dr[size] = 0.0;
                dl[size] = 0.0;
                if (j <= y_span - size && j >= 0) {
                    ver = vMult(i,j);
                    if (i < x_span - size +1 && i >= 0) {
                        dr = dRMult(i,j);
                    }
                    if (i >= size-1 && i < y_span) {
                        dl = dLMult(i,j);
                    }
                }
                
                if (i < x_span - size +1 && i >= 0) {
                    hor = hMult(i,j);
                }
            }
        }
    }
    
    public ArrayList<Double> getMaxSet () {
        return max;
    }
    
    public String getDir () {
        return dir;
    }
    
}
