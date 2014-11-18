/**
 * Write a simple Java program to reverse the given numbers (246813579)
 * 246813579 => 975318642
 * @author QA1
 */
public class ReverseString {
	public static void main (String []arg){
		int number = 45678;
		String num = String.valueOf(number);
		StringBuffer reversedNumber = new StringBuffer(num).reverse();
		System.out.println(reversedNumber);
	}

}
