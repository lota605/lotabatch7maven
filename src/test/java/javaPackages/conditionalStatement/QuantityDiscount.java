package conditionalStatement;

import java.util.Scanner;

public class QuantityDiscount {
    // 1.A shop give discount of 10% if the cost of purchased quantity is more than 1000.
    //    Ask user for quantity suppose one unit will cost 20 dollar.

    public void discount(){
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        int total_cost = quantity * 20;

        if(quantity>1000){
            int discount =( (total_cost/100) * 10);
            System.out.println(discount);
        }
        else {
            System.out.println("no discount");
        }
    }

    public static void main(String[] args) {
        QuantityDiscount obj =new QuantityDiscount();
        obj.discount();
    }






}


