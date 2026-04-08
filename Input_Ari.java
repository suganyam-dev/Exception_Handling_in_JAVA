package Exception_Handling;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Input_Ari {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b=10/0;
		}
		catch(InputMismatchException e){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println("Arrithmetic exception handled!! ");
		}
	}

}
