package diamond;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {

    @Test
    public void printAAforA(){
        String result = Diamond.printDiamond("a");
        assertEquals("A\nA", result);
    }

    @Test
    public void printABBAforB(){
        String result = Diamond.printDiamond("b");
        assertEquals(" A\nB B\n A", result);
    }

    @Test
    public void printABBCCDDCCBBAforB(){
        String result = Diamond.printDiamond("d");
        assertEquals("   A\n  B B\n C   C\nD     D\n C   C\n  B B\n   A", result);
    }

}