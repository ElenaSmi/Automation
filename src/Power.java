/**
 * Write a simple Java program that prints 100 the powers of 2 numbers.
 * example: 2 4 8 16 32 64 ...
 * @author QA1
 */
public class Power {
	public static void main (String []arg){
		for (int i = 0; i < 100; i++){
			System.out.println((int)Math.pow(i, 2));
		}
	}

}
