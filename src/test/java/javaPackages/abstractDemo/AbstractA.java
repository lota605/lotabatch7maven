package javaPackages.abstractDemo;

public abstract class AbstractA {
    //Abstract is a process when Hiding the implementation showing only functionality
    //Abstract class cannot be instantiated/ cannot create object
    //Abstrat class can hols both abstract and non-abstract method
    //Abstract  class can be 0-100% abstraction.

    int cardNo;
    String customerName;
    int cvvNo;
    String billingAddress;
    int exp;

    public abstract void placeOrder();

    public abstract void emailMessage();



public void cardInfo(){
    cardNo =24444566;
    customerName="lota";
    cvvNo =343;
    billingAddress= "144-25 Roosevelt Ave";
    exp = 1224;
}

    public static void main(String[] args) {

    }
}
