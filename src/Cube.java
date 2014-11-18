/**
 * Implement isCube method. 
 * Write a method that determines whether a given integer is a cube of some number
 * @author QA1
 */

public class Cube {
	
	public static void main(String []args){
		System.out.println(isCube(27));
	}
	
	
//	public static boolean isCube(int num){
//		if(Math.cbrt(num)%1 == 0){
//			return true;
//			} else {
//				return false;
//				}
//		}
	
	
		public static Boolean isCube(int num) {
		int x = 1;
		Boolean status = false ;

		while (x < 200) {
		if((num - x*x*x) > 0){
		x +=1;
		}
		if (num == x*x*x) {
		status = true;
		break;
		}
		if((num - x*x*x) < 0){
		status = false;
		break;
		}
		}
		return status;
		}
		
//	public static boolean isCube(int num){
//		double x = Math.cbrt(num);
//		int i = (int) x;
//		if(i == x){
//			return true;
//		}
//		else {
//			return false;
//		}
//		
//	}

}
