package conditionalStatement;

import java.util.Scanner;

public class Mark {
    /*

8:07 PM

UTS to Everyone

2. A school has following rules for grading system:
a. Below 25 - F
b. 25 to below 45 - E
c. 45 to below 50 - D
d. 50 to below 60 - C
e. 60 to below 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade

     */

    public void gread() {
        Scanner scan = new Scanner(System.in);
        int F = scan.nextInt();

        if (F == 25) {
            System.out.println("The student got F");
        }

        else if (F == 45) {
            System.out.println("The student got E");
        }

        else if (F == 50) {
            System.out.println("The student got D");
        }

        else if (F == 60) {
            System.out.println("The student got C");
        }

        else if (F == 80) {
            System.out.println("The student got B");
        }

        else {
            System.out.println("The student got A");
        }
    }
    public void grade1() {
        //update the code with range for grade system

        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if (mark < 25) {
            System.out.println("The student got grade F");

        } else if ((mark == 25) || (mark < 45)) {
            System.out.println("The student got grade  E");

        } else if ((mark == 45) || (mark < 50)) {
            System.out.println("The student got grade  D");

        } else if ((mark == 50) || (mark < 60)) {
            System.out.println("The student got grade  C");

        } else if ((mark == 60) || (mark < 80)) {
            System.out.println("The student got grade  B");

        } else if ((mark == 80) || (mark > 80)) {
            System.out.println("The student got grade  A");
        }
    }



        public static void main (String[]args){
            Mark obj = new Mark();
           // obj.gread();
            obj.grade1();

        }
    }
