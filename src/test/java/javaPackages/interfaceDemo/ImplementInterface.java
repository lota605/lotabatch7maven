package javaPackages.interfaceDemo;

public class ImplementInterface implements InterfaceA {

//extandes and implement is same but diffrent word.In abstract use extansdes ans interface use implement.

    public void placeOrder() {
        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);
        System.out.println("your order has been ");
        emailMessage();

    }


    public void emailMessage() {
        System.out.println("your oreder has been place");



    }

    public static void main(String[] args) {

        ImplementInterface obj = new ImplementInterface();
        obj.placeOrder();

    }
}