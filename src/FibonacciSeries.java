import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of terms: ");
	int n=scanner.nextInt();
	
	System.out.println(" fibonacci series");
	for (int i = 0; i < n; i++) {
        int fibonacci=calculateFibonacci(i);
        System.out.println(fibonacci+" ");
	}
	scanner.close();}


public static int calculateFibonacci(int n) {
    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    } else {
        int a = 0;
        int b = 1;
        int fibonacci = 0;
        
        for (int i = 2; i <= n; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        
        return fibonacci;



}}}
	

