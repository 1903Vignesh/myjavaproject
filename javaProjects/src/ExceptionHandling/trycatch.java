package ExceptionHandling;

public class trycatch {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int Number1=0;
			int Number2=3;
			
			int result=Number2/Number1;
			
			System.out.println(result);
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("drink a lemon juice and don't divide a number by Zero");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("if Arithmatic exception");
		}
	}

}
