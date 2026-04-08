package Exception_Handling;


public class Arithmetic_Exception{
	public static void main(String args[]) {
		
		
		try {
			int a = 10/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Program Ended!!");
	}
	


}
