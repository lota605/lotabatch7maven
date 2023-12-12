package javaPackages.finalKeyword;

public  class FinalDemo {

    /*
    Final keyword can be used before the Class, method and variables
    Final class cannot be extended.This class cannot have any child.
    Final variable cannot be modified.the value is final miens fixe.
    Final method cannot be overridden

    override: override is a part of oop concept

    Dharti and Shifat  they both of them work in the same project


     */

     String name="Lota";  //if variable is final ve can not change valu.if not final we can change value.
     final int number=10;

    public final void printName(){
        System.out.println(" Printing Name");
    }

    /*
    this method created by shifat
    When date
     */

    public void myName(){

        System.out.println("Lota is my name");
    }



    public static void main(String[] args) {

        FinalDemo obj =new FinalDemo();
        obj.name ="Lota Mahmud";
        System.out.println(obj.name);
       // obj.number=12;  //if variable is final ve can not change value
        System.out.println(obj.number);
        obj.printName();

    }
}
