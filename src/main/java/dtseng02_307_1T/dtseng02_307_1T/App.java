package dtseng02_307_1T.dtseng02_307_1T;

/**
 * Multiplication of two integers
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	int int1 = 5;
    	int int2 = 10;
    	
    	System.out.printf("%d * %d = %d\n", int1, int2, multiplication(int1, int2));
    }
    
    private static long multiplication(int int1, int int2) {
    	return int1*int2;
    }
}
