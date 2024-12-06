public class Factorial {
  public static long getFactorial(final int number) { 
    if ((number >= 0) && (number < 21)) { 
        long fact = 1; 
        for (int i = 1; i <= number; i++) { 
            fact = fact * i; 
        } 
        return fact; 
    } else { 
         
         
        throw new IllegalArgumentException("THe argument isn't legal"); 
    } 
} 
 
public static void main(String[] args) { 
    System.out.println(getFactorial(-5)); 
    System.out.println(getFactorial(21)); 
} 
}