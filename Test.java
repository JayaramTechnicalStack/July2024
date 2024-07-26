public class Test {


public Test(){

System.out.println("default constructor");
}

public Test(int a){

System.out.println("parameter constructor");
}

public int sum(int a , int b){
 
return a+b;

}


public int sum(int a ,int b, int c){

return a+b+c;

}

public static void main(String [] args){

Test t2 = new Test();

Test t = new Test(10);

int result = t.sum(10,20,30);

System.out.println(result);
}

}