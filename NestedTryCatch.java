package basic;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try { // outer try 

			try {

				System.out.println("going to divide");
				int b = 10 / 2;
				System.out.println("b value is :" + b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
			try {
				
				int a[] = new int[5]; // 0,1,2,3,4
				
				a[4] = 10;
				System.out.println(a[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			
			try {
				String str = "Welcome";
				System.out.println(str.length());
			} catch (NullPointerException ne) {
				ne.printStackTrace();
			}
			
			System.out.println("other statement");
			
		} catch (Exception e) { // outer catch block

			System.out.println("handeled");
			
		}finally {
			System.out.println("Inside finally block executed");
			
			// all database connections 40+10 = 50 closing here 
			// connection.close();
			// files concept , we can close file streams 
		}

		System.out.println("normal flow..");

	}

}
