public class week10 { 
  static void checkAge(int age){ 
    if (age < 18){ 
        throw new ArithmeticException("Access denied - You must be at least 18"); 
    } 
    else{ 
        System.out.println("Access granted - You are old enough!"); 
    } 
} 
 
public static void main(String[] args) {         
        System.err.println("===Throw Error==="); 
         
        checkAge(18); 
        System.out.println("oooo"); 
}        
}