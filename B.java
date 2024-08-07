package excepoveride;

import java.io.IOException;
import java.sql.SQLException;

public class B extends A {
	
	void show() throws RuntimeException {
		System.out.println("Inside Child show()...");
	}

	public static void main(String[] args) {
		

	}

}
