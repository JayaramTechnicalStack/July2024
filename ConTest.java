public class ConTest{

public ConTest(){ // 4
System.out.println("default constructor"); // 5

}

public ConTest(int a){ //3
System.out.println(" Single Param constructor :"+a); // 6

}

public ConTest(int a,int b){ //2 

this(10);
System.out.println(" two Param constructor :" +(a+b)); // 7

}


public static void main(String [] args){

ConTest t3 = new ConTest(10); // 1

}

}
