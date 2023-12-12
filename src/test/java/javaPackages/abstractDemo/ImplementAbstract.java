package javaPackages.abstractDemo;

public class ImplementAbstract extends AbstractA{


    public void placeOrder(){
        //connect with the Bank server
        //Verify information
        //return positive or negative response

       System.out.println("your order has been placed ");

        emailMessage();  //call the method

        super.cardInfo();    //there call the method,This is  AbstractA class method.

        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);

    }


    public void emailMessage(){

        System.out.println("Your order has been successfull ");


    }


    public static void main(String[] args) {

        ImplementAbstract obj = new ImplementAbstract();
        obj.placeOrder();

        //obj.emailMessage();

    }


}
