package basic;

public class TryWithMultiCatch {

	public static void main(String[] args) {
	try {
		 int a = 10/0;	
	}catch (ArrayIndexOutOfBoundsException aie) {
		aie.printStackTrace();
	}catch (NullPointerException ne) {
		ne.printStackTrace();
	}catch (ArithmeticException ae) {
		ae.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("statements");

}
}
