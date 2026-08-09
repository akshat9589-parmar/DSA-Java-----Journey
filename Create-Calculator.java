// Make a calculator. Take 2 number (a & b) from the user.

 
import java.util.*;


class Fristclass {

    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("a:"+ a);
       System.out.println("b:"+ b);

// Sum
        int sum = a + b;
           System.out.println("sum: " + sum);

// Difference
        int diff = a - b;
            System.out.println("diff:" + diff);

//Multiply
        int mul = a * b;
             System.out.println("mul:" + mul);

// Division                        
         int div = a / b;
             System.out.println("div:" + div);
    }
}