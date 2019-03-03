package palindrome;

import java.util.logging.Logger;

public class MainApp {
    
    private static Logger logger = Logger.getLogger(Palindrome.class.getName());

    public static void main(String[] args) {
       new Palindrome().palindrome();
    }
}
