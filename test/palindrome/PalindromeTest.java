package palindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    
    public PalindromeTest() {
    }
    
    @Test
    public void testCheck() {
        String numberFalse = "998";
        Palindrome instanceFalse = new Palindrome();
        boolean expResultFalse = false;
        boolean resultFalse = instanceFalse.check(numberFalse);
        assertEquals(expResultFalse, resultFalse);
        String numberTrue = "999";
        Palindrome instanceTrue = new Palindrome();
        boolean expResultTrue = true;
        boolean resultTrue = instanceTrue.check(numberTrue);
        assertEquals(expResultTrue, resultTrue);
    }
}
