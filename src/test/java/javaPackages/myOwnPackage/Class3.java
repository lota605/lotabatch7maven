package javaPackages. myOwnPackage;

import javaPackages.accessModifire.Access1;

public class Class3 extends Access1 {




    public static void main(String[] args) {

        Class3 obj =new Class3();
        System.out.println(obj.houre);
        System.out.println(obj.year);
       // System.out.println(obj.day);

        //here printMinuites private is not work bez only accessbile same class
        //no access like printDay also not work bez accessbile only same package.

        obj.printHours();
        obj.printYear();
    }

}
