package javaPackages.encapsulationDemo;

public class Encap2 extends Encap{




    public static void main(String[] args) {
        Encap obj =new Encap();

        obj.setSsn(104046970);  //give valus in setter method
        System.out.println(obj.getSsn());  //getter method print the method
    }
}
