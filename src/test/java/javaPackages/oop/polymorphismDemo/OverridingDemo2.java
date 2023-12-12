package javaPackages.oop.polymorphismDemo;

public class OverridingDemo2 extends OverRidingDemo1{

//parent class==Super Class
 //Child Class==Sub Class

//this designed by Dharti
@Override
    public void courseMember(int members){
        System.out.println(members);
        String group="Selenium";
        System.out.println(group);

    }

    public static void main(String[] args) {
        OverridingDemo2 obj =new OverridingDemo2();
        obj.courseMember(8);
    }
}
