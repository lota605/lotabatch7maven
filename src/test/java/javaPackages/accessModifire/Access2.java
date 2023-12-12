package javaPackages.accessModifire;

public class Access2 extends Access1 {

/*
AccessModifire are four typs:
1.public
2.private
3.----or we can say package private
4.protected
 */



    public static void main(String[] args) {

        Access2 obj= new  Access2();
        System.out.println(obj.houre);
        System.out.println(obj.day);
       // System.out.println(obj.minutes); we can not use becuse is private
        System.out.println(obj.year);

        obj.printHours();
        obj.printDay();
        obj.printYear();  //here printMinutes is not call bez private, use only same class.



    }
}
