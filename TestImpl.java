public  class TestImpl extends Test {

public void show(){

System.out.println("Inside show method");

}

public static void main(String [] args){

Test t = new TestImpl(); // parent ref can hold the child object
t.show();
t.display();

}

}