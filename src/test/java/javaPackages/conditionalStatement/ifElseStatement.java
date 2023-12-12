package conditionalStatement;

import java.util.Scanner;

public class ifElseStatement {

    //ifElse statement= conditional statement

     int num = 20;

    public  void ifelse() {

        if (num == 10) {
            System.out.println("num is 10");
        } else if (num == 15) {
            System.out.println("num is 15");
        } else if (num == 20) {
            System.out.println("num is 20");
        } else {
            System.out.println("none of the above is true");
        }

    }

    public void condition() {
        int time = 8;

        if (time < 9) {
            System.out.println("good morning");
        } else if (time <= 11) {
            System.out.println("good noon");
        } else if (time <= 15) {
            System.out.println("good afternoon");
        } else {
            System.out.println("good nignt");
        }
    }

    public void practice() {
        //Ask user to enter any number through your code you print the number
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your number below ");
        //int number = scan.nextInt();
        //System.out.println("My number is " + number);





    }


    public static void main(String[] args) {
        ifElseStatement obj = new ifElseStatement();
        //obj.condition();
        obj.ifelse();
       // obj.practice();
//
//       String veg = "Tomatoo";
//
//        if (veg == "Tomatoo") {
//            System.out.println("bring it home");
//        } else {
//            System.out.println("bring something eles");
//        }
    }
}

