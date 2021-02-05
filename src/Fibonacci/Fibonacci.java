package Fibonacci;

/**
 *
 * @author Polis
 */
public class Fibonacci {
    
    public static int compute(int num) {
        int result = 0;
        if (num <= 1) {
            result = num;
        }else {
            result = compute(num - 1) + compute(num - 2); 
        }
        return result;
    }
    
}
