package opperator;

import java.util.Scanner;

public class LogicalOpearator2 {

    // //homework --get input age (int),regNo(short), StockBalance(float)
    public void reg(){

        Scanner scan= new Scanner(System.in);

        short regNo = scan.nextShort();
        System.out.println("My reg number is " + regNo);


          float stockBalance = scan.nextFloat();
          System.out.println("my stockBalance is " + stockBalance);

          String Fruits = scan.nextLine();
          System.out.println("I like very much " + Fruits);
    }

    public static void main(String[] args) {
        LogicalOpearator2 obj = new LogicalOpearator2();
        obj.reg();

        Scanner scan= new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("My age is " + age);


    }
}
