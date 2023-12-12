package conditionalStatement;

import java.util.Scanner;

public class StoreQuanitity {


    // 1.A shop give discount of 10% if the  quantity is more than 1000.
    //    Ask user for quantity suppose one unit will cost 20 dollar.

    int discount;



    public void diccount(){

        Scanner scan = new Scanner(System.in);
        int quantity =scan.nextInt();

        if(quantity>1000){
            int totalcost =(quantity*20);
            System.out.println("Total Cost " + totalcost);
            int discount = (totalcost/100) * 10 ;
            System.out.println("Discount " + discount);
        }
        else{
            System.out.println("No Didcount");
        }

    }

    public void discount1(int quantity){

        //same QA we use paramiter here also if amount is less than 1000  no dicount.use class level discount.

        if(quantity>1000){
             int totalcost =(quantity*20);
            System.out.println("Total Cost " + totalcost);

             discount =( totalcost/100) * 10;
            System.out.println("Discount " + discount);
        }
        else{
            System.out.println("No Didcount");
        }
        /*
        we can do this way too same thing
        int totalcost=0;
        int discount=0;
        if(quantity>1000){
        totalcost=(quantity*20);
        System.out.println(totalcost);
        discount=(totalcost/100)*10;
        system.out.println(discount);
         */

    }
    public void buysomethingWithDiscount(){
        //if we dectar discount in class lavel then we can use that.

        System.out.println("buying some burger with the discount valu " + discount);
    }

    public static void main(String[] args) {
        StoreQuanitity obj = new StoreQuanitity();
       // obj.diccount();
        obj.discount1(1400);
        obj.buysomethingWithDiscount();

    }










}
