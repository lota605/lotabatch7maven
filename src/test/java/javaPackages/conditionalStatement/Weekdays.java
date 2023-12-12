package conditionalStatement;

import java.util.Scanner;

public class Weekdays {

//    write a java function and use the parameter of an integer between1 and 7.it displays the weekday name.

    public void weekday(int a ) {    //method signature
        Scanner scan = new Scanner(System.in);


        if (a == 1) {
            System.out.println("Sunday");
        }
        else if (a == 2) {
            System.out.println("Monday");
        }
        else if (a == 3) {
            System.out.println("Tuesday");
        }
        else if (a == 4) {
            System.out.println("Wednesday");
        }
        else if (a == 5) {
            System.out.println("Thursday");
        }
        else if (a == 6) {
            System.out.println("Friday");
        }
        else if (a == 7) {
            System.out.println("Satarday");
        }
    }

    public static void main(String[] args) {
        Weekdays obj = new Weekdays();
        obj.weekday(7);
    }

}
