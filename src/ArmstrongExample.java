// check given no is armstrong or not?


import java.util.Iterator;
import java.util.Scanner;

public class ArmstrongExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=scanner.nextInt();
		int originalNum=num;
		int sum=0;
		for (int temp = num; temp >0; temp/=10) {
			int digit=temp%10;
			sum+=Math.pow(digit, 3);
		
		}
		if (sum==originalNum) {
			System.out.println(originalNum+"is an armstrong number.");
					
		}else {
			System.out.println(originalNum+"is not an armstrong number.");
		}
		scanner.close();
	}

}
