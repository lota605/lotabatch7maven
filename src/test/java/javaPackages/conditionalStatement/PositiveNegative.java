package conditionalStatement;

import java.util.Scanner;

public class PositiveNegative {

    //take a number from user find that the number is positive or negative
   // Exa: 0.1.2.3 is positive and -1,-2,-3,-4.435 is negative

    public void positiveNegative(){
        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();

       if(a==0){
           System.out.println(a + "is a positive number ");
       }
       else if(a>0){
           System.out.println(a + "is a positive number");
       }
       else if(a<0 ){
           System.out.println(a+ "is a negative number");
       }
    }
    //fixe means is devug in java

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.positiveNegative();
    }
}
