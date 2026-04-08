package Exception_Handling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidator{
	void checkAge(int age) {
		try {
			if(age<0 || age> 150) {
				throw new InvalidAgeException("age is invalid");
			}
			else {
				System.out.println("valid age");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

public class Custom_Exception_Practice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		AgeValidator a = new AgeValidator();
		a.checkAge(age);
		
	}

}
