/**
 * prints out Fibonacci numbers upto entered value using the method above
 * for (int i =1; i<number; i++) {
 * System.out.print(fib(i) + " ");
 * }
 * @author QA1
 */
public class FibonacciNumbers {
	public static void main (String []args){
		int number = 15;
		for (int i = 1; i <= number; i++)
			System.out.print(fib(i) + " ");
	}
	
	public static int fib(int n){
		
		if( n == 1 || n == 2)
			return 1;
		else
			return (fib(n-1) + fib(n-2));
		
	}

}

	
