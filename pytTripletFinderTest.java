import static org.junit.Assert.*;

import org.junit.Test;

public class pytTripletFinderTest {

    @Test
    public void testTrivial() {
        System.out.println("T1");
        pytTripletFinder pFin = new pytTripletFinder(12);
        pFin.find();
        System.out.println("T1");
    }
    
    @Test
    public void testTrivial2() {
        System.out.println("T2");
        pytTripletFinder pFin = new pytTripletFinder(198);
        pFin.find();
        System.out.println("T2");
    }
    
    @Test
    public void testQuestion() {
        System.out.println("T3");
        System.out.println("Question answer list:");
        pytTripletFinder pFin = new pytTripletFinder(1000);
        pFin.find();   
        System.out.println("T3");
    }

}
