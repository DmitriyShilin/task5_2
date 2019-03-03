package palindrome;

import java.util.logging.Logger;

public class Palindrome {
    
    private static Logger logger = Logger.getLogger(Palindrome.class.getName());
    
    public void palindrome(){
        for(int i = 1000; i<10_000; i++){
            for(int j = 1000; j<10_000; j++){                
                if(check(String.valueOf(i*j))){                    
                    logger.info(String.valueOf(i*j));
                }                
            }
        }
    }
    
    public boolean check(String number){
        char[] rowNumber =  number.toCharArray();
        for(int k = 0, n = rowNumber.length - 1; k<rowNumber.length/2; k++, n--){
            if(rowNumber[k] != rowNumber[n]){
                return false;
            }
        }
        return true;
    }    
}
