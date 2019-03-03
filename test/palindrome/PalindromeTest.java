package palindrome;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    
    public PalindromeTest() {
    }
    
    @Test
    public void testCheck() {
        String number = "998";
        Palindrome instance = new Palindrome();
        boolean expResult = false;
        boolean result = instance.check(number);
        assertEquals(expResult, result);
    }
}
