package javaPackages.opperator;

public class AritmaticOperators1 {

    /*
    Parameters act as variable inside the method.Parameters are specified after the method name.
    we can add as many parameters as we want,just separate them with a comma.


     */

    public  static void myMethod(String lota){  //this static method not need obj
        System.out.println(lota + " is my name");

    }
    public void method(int number){   //this is non-static method, this method called need obj

        System.out.println(number);
    }
    public static void information(String name, int age){

        System.out.println(name + " is " +age + " years old");
    }

    public static void main(String[] args) {
        AritmaticOperators1 obj= new AritmaticOperators1(); // crating obj of class

        myMethod("Lota");  //argument
        myMethod("Xyra");
        myMethod("Taseen");
        myMethod("Tahrwat");

        obj.method(15);  //argument
        obj.method(10);
        obj.method(20);

        information("Alex",23);
        information("Tareq",33);

    }
}
