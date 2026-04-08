package Exception_Handling;

import java.util.Scanner;

public class Throw {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();
			if(age<1) {
				throw new ArithmeticException("Age should be greather than 1");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("program Ended!!");
	}

}
