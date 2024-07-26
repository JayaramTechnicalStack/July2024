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

Payment p1 = new Payment();
p1.processPayement(100);

}
}


