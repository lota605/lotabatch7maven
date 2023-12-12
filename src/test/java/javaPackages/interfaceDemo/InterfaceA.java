package javaPackages.interfaceDemo;

public interface InterfaceA {
    //Interface is a process when Hiding the implementation showing only functionality
    //Interface class cannot be instantiated/ cannot create object
    //Interface can hols only abstract method
    //Interface can be 100% abstraction.
    //In Interface the variable are final by defauld

   /* //final variable
    int cardNo=244353;
    String customerName="lota";
    int cvvNo=434;
    String billingAddress="144-25 Roosevelt Ave ";
    int exp=125;

*/
    public  void placeOrder();

    public void emailMessage();   //this is abstract method but not need to right abstract.


}
