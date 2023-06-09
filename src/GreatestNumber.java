//print the user and print the greatest number.
import java.util.Scanner;

public class GreatestNumber {
 public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter the first no: ");
	int num1=scanner.nextInt();
	
	System.out.println("enter the second no: ");
	int num2=scanner.nextInt();
	
    System.out.println("enter the third no: ");
    int num3=scanner.nextInt();
    
     int greatest= num1;
     if (num2>greatest) {
    	 greatest=num2;
			}
     if (num3>greatest) {
    	 greatest=num3;
    	 }
     System.out.println("The greatest number is :"+ greatest);
     }
}
