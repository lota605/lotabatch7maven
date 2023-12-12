package javaPackages.interfaceDemo;

public class ImplementInterface implements InterfaceA {

//extandes and implement is same but diffrent word.In abstract use extansdes ans interface use implement.

    public void placeOrder() {

        String name= "lota mahmud";
        System.out.println(name);
    }


    public void emailMessage() {



    }

    public static void main(String[] args) {

        ImplementInterface obj = new ImplementInterface();
        obj.placeOrder();

    }
}