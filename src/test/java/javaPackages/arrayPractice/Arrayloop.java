package arrayPractice;

public class Arrayloop {

    /*
    Write a java function
    and create an array in 4,5,6,7,8,9,10
    and use loop and
    determine that which number is divide by 2 or not.if divided by 2 that is even else the number is odd.
     */

int [] number = {4,5,6,7,8,9,10};   //create an Array

public void Array(){       //java function

    System.out.println(number.length + " This is Array length");

    for(int i=0;i<=6;i++){    //use for loop

       // System.out.println(number[i]);

        if(number[i] % 2 ==0){
            System.out.println(number[i] + " is an Even Number");
        }
        else if(number[i] % 2 ==1){
            System.out.println(number[i] + " is an Odd Number");
        }
    }

       //even else the number is odd




}

public void extrawork(){
//Extra work by Lota print A to Z using for loop

    for(char i='A';i<='Z';i++){
        System.out.print(i);   //here i am not use println only print
    }
    System.out.println("..............");

    //print odd number 25 to 45

    for(int i=25;i<=45;i=i+2){
        System.out.println(i);
    }
    System.out.println("..............");

    //use a for loop to print "Lota" 5 times

    for(int i=0; i<5; i++) {
        System.out.println("Lota");
    }

}





    public static void main(String[] args) {
        Arrayloop obj = new Arrayloop();
        obj.Array();
      //  obj.extrawork();

    }
}
