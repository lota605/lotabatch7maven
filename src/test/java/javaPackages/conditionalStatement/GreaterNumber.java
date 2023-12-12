package conditionalStatement;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class GreaterNumber {


    public void greater() {

        //.take two numbers from user and print the greater number.

        Scanner scan = new Scanner(System.in);  //Pre defiend class create by java and we can get External libraries.
        int a = scan.nextInt();
        System.out.println("The first number is " + a);
        int b = scan.nextInt();
        System.out.println("The second number is " + b);

        if (a > b) {
            System.out.println(a + "is The greater number  ");
        } else if (a == b) {
            System.out.println(a + "is The equal number " + b);
        } else {
            System.out.println(a + "is The smaller number ");
        }

    }

    public static void main(String[] args) {

        GreaterNumber obj = new GreaterNumber();
        obj.greater();

    }
}