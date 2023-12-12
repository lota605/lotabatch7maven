package javaPackages.conditionalStatement;

public class EvenOddNumber {


    //  write a java function and take a int parameter and determine that the number is devided by 2 or not.
    //    if devided by 2 that is even else the number is odd.


    public void EvenoddNumber(int number){      //method signature

        if(number % 2 ==0){          //here 0 is Remainder. vagses ka reminder bola hoi.
            System.out.println(number + " is an Even Number");
        }
        else if(number % 2 ==1){
            System.out.println(number + " is an Odd Number");
        }
    }       //method body
    //method has 2 part :1. method signature  2.//method body
    //variable has 3 part: 1.declare the variable  2.initiaize variable  3.use the variable



    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();
       obj.EvenoddNumber(13);

        //GreaterNumber3 obj2 = new GreaterNumber3();
       // obj2.printGreater(4,6,8);


    }

}
