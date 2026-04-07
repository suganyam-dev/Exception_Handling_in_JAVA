package Exception_Handling;
import java.util.Scanner;


public class Input_Mismatch_Exception {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			try {
			int a = sc.nextInt();
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("program failed!!");
		}

	


}
