
package week7;
import java.util.Scanner;


public class ReversedNumber {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int num=sc.nextInt();
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        
        System.out.println("Reversed number is: " + reversed);
     

    }
}
