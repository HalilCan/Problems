
public class pytTripletFinder {
    int sum = 0;
    int a = 0;
    int b = 0;
    double sum2 = 0.0;
    
    public pytTripletFinder (int target) {
        sum = target;
        sum2 = Math.sqrt((double)sum) + 5.0;
        
    }
    
    public int[] find () {
        int[] serie = new int[2];
        for (int i = 1; i < (int)sum2 ; i ++) {
            a = i;
            for (int j = i+1; j < (int)sum2 ; j ++) {
                b = j;
                if ( 0 == (sum) % (2 * (b * ( a + b ))) ) {
                    int small = a;
                    int big = b;
                    int hypo = a*a+b*b;
                    int edge_one = b*b-a*a;
                    int edge_two = 2*a*b;
                    int multiplier = (sum / 2) / (b * ( a + b ));
                    System.out.println(small);
                    System.out.println(big);
                    System.out.println(edge_one);
                    System.out.println(edge_two);
                    System.out.println(hypo);
                    System.out.println(multiplier);
                    
                    serie[0] = a;
                    serie[1] = b;
                    return serie;
                }
            }
        }
        serie[0] = 0;
        serie[1] = 0;
        return serie;
    }
}
