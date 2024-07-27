import java.util.*;

class Payment {

public void processPayement(int amount){

System.out.println("Processing the generic Payment :" + amount);
}
}

class CreditCard extends Payment {

public void processPayement(int amount){

System.out.println("Processing a credit card Payment :" + amount);
}

}

class Cheque extends Payment {

public void processPayement(int amount){

System.out.println("Processing a cheque  Payment :" + amount);
}

}

class BankTransfer extends Payment {


public void processPayement(int amount){

System.out.println("Processing a bank transfer  Payment :" + amount);
} 

}

public class PaymentDemo {

public static void main(String [] args){

int amount = 500;

Scanner sc = new Scanner(System.in);
System.out.println("Enter PaymentType");

String paymentType = sc.next();

Payment payment = getPaymentInstance(paymentType); // Payment payment = new Credicard()

if(payment !=null){

payment.processPayement(amount);
}else {
 
System.out.println("invalid payment");
}

}

public static Payment getPaymentInstance(String paymentType){

Payment payment = null;

switch(paymentType){

case "creditCard": 
		payment = new CreditCard();
		break;
case "cheque": 
		payment = new Cheque();
		break;
case "bankTransfer": 
		payment = new BankTransfer();
		break;
default 	: 
		 System.out.println("UnSupported Paymet Type");
		break;


}
return payment; // creditcardObject 

}
}


