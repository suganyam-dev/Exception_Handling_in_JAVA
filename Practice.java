package Exception_Handling;

import java.util.Scanner;

class Division{
	void divideNum(int nume, int deno) {
		try {
			int result = nume/deno;
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}
}

public class Practice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Division d = new Division();
		d.divideNum(n1,n2);
		
	}

}
