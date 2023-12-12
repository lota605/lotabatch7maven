package arrayPractice;

import java.util.Arrays;

public class SortArray {

    //Write a program to Sort Numeric Array In Ascending Order
    //Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}



    public void ascending(){

        int[]number={23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        Arrays.sort(number);

        for(int i=0;i<number.length;i++){
           System.out.println(number[i]);

            }


    }

    public static void main(String[] args) {
        SortArray obj =new SortArray();
        obj.ascending();
    }

}
