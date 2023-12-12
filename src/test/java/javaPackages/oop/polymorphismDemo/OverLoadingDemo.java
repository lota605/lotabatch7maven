package javaPackages. oop.polymorphismDemo;

public class OverLoadingDemo {

    /*
    overloading can be achieved by the same method name but
    i.different number of parameter
    ii.different data type
    iii.different order of parameter

    Overloading is called compile time polymorphism

     */


    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a,int b, int c){
        System.out.println(a+b+c);
    }

    public void add(int a, float b){
        System.out.println(a+b);
    }

    public void add(float b, int a){
        System.out.println(b+a);

    }

    public static void main(String[] args) {

        OverLoadingDemo obj =new OverLoadingDemo();
        obj.add(3,5);
        obj.add(3,5,7);
        obj.add(2,4.4f);
        obj.add(2.2f, 9);
    }
    /*
    Access modifiers
    final
    overloading
    overriding
     */

}
