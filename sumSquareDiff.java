import java.util.ArrayList;

public class sumSquareDiff {
    private int sumOfSquares = 0;
    private int squaresOfSum = 0;
    private int min = 0;
    private int max = 0;
    public sumSquareDiff () {
        sumOfSquares = 0;
        squaresOfSum = 0;
        max = 0;
        min = 0;
    }
    
    public void setRange (int min2, int max2) {
        max = max2;
        min = min2;
    }
    
    public void calc () {
        int sumS = 0;
        int sqSum = 0;
        for (int i = min; i < max + 1; i++) {
            sumS = i*i + sumS;
            sqSum = sqSum + i;
            if (i == max) {
                sqSum = sqSum*sqSum;
            }
        }
        sumOfSquares = sumS;
        squaresOfSum = sqSum;
    }
    
    public int getDifference () {
        return (squaresOfSum - sumOfSquares);
    }
}
