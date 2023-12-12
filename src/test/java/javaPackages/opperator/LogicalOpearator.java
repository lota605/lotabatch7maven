package javaPackages.opperator;

import java.util.Scanner;

public class LogicalOpearator {
//and (&& ),or (||)--this are also returning true/false
    int a =20;
    int b =9;
    int c =12;

    public void logical(){

        boolean result1 =(a>b)&&(b>c);
        System.out.println(result1);

        boolean result2 =(a<b)&&(b==c);
        System.out.println(result2);

        boolean result3=(a<b)||(b<c);
        System.out.println(result3);

        boolean result4=(a>b)||(c<b);
        System.out.println(result4);

    }
    /*
     operator Precedence

     &&  True,True=True. True,False=False. False,True=False.False,False=False
     || True,True=True.True,False=True.False,True=True.False,False=False
    */


    public static void main(String[] args) {
        LogicalOpearator obj = new  LogicalOpearator();
       // obj.logical();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your name below");
        //scan.nextLine();  //nextLine is String data, nextint is int data
        String myname= scan.nextLine();
        System.out.println("My name is " + myname);

        //home work --get input age (int),regNo(short), StockBalance(float)
    }
}
