package javaPackages.parameterization;

public class Mathmatics {

    public void add(int a, int b){   // parameter
        System.out.println(a+b);

    }

    public static void main(String[] args) {

        Mathmatics obj =new Mathmatics();
        obj.add(2,5);
        obj.add(100,102); // calling the method with arguments
        obj.add(105,106);
        obj.add(222,333);
        obj.add(1000,500);

    }
    /*
    1.What is static in java?
    Ans:Static keyword can be applied to variables and method.
    This belongs to the class not to the instance/object, but this is common to all instances.

    2.Can we use a non-static variable static method?
    Ans:No

    3.Can a static method be called in non-static method?
    Ans:Yes

    4.Why is main method static?
    Ans: Because compile needs to call it without creating an object.
    Another reason is java program compile starts executing programs from main method.

    5.Can static method or static variable be private?
    Ans: Yes

    6.What is different between static and constant?
    Ans: Constant is variable fixed during compile time with value does not change in the run time.
    But static variable can be changed in the run time.


     */
}
