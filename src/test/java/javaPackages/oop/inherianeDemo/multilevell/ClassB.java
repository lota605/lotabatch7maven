package oop.inherianeDemo.multilevell;

public class ClassB  extends ClassA {

   // nheritance is relation with parent and child .we need create of obj in child class,not parent class.
    //extends keyword we use only Inheritance.


    public static void main(String[] args) {

        ClassB obj = new ClassB();
        System.out.println(obj.property1);
        System.out.println(obj.property2);
        System.out.println(obj.hasCar);

        obj.sellpropertys();

    }
}
