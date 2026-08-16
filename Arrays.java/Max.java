import java.util.*;

public class Max-Min {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int number[] = new int[2];

        number[0] = sc.nextInt();
        number[1] = sc.nextInt();

        if(number[0] > number[1]) {
            System.out.println(number[0]);
        }
        else if(number[1] > number[0]) {
            System.out.println(number[1]);
        }
        else{
            System.out.println("Both are Equal");

        }

    }
}