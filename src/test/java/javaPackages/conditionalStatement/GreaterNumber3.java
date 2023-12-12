package conditionalStatement;

import java.util.Scanner;

public class GreaterNumber3 {
    /*
    1.A shop give discount of 10% if the cost of purchased quantity is more than 1000.
    Ask user for quantity suppose one unit will cost 100.judge and print total cost for user.
    2.write ajava function and take three int parameters and prints the greaters number.
    3.write a java function and user the parameter of an integer between1 and 7.it displays the weekday name.
    4.write a jaa function and take a int parameter and determine that the number is devided by 2 or not.
    if devided by 2 that is even else the number is odd.

    */
    public void printGreater(int x, int y, int z){
/*
write a java function and take three int parameters and prints the greaters number
x = 4
y = 3
z = 2
 */
        if((x>y) && (x>z)){
            System.out.println(x + " is the greater number");
        }
        else if((y>x) && (y>z)){
            System.out.println(y + " is the greater number");
        }
        else if ((z>x) && (z>y)){
            System.out.println(z +" is the greater number");
        }

    }



    public static void main(String[] args) {
        GreaterNumber3 obj = new GreaterNumber3();
      //  obj.printGreater(12,13,14);
       // obj.printGreater(22, 21, 20);

        obj.printGreater(30, 35, 32);

    }
}
