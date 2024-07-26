 class Parent {

public void display(){

System.out.println("inside parent display ");

}

}

public class Child extends Parent {

public void display(){

System.out.println("inside child display ");

}

public static void main(String [] args){

Parent p = new Parent();

p.display();

}

}