package javaPackages.loopDemo;

public class LoopPositiveNegative {
/*
 write a  function (method)
 and that create a loop between 1-10
 .and determind which number is Positive and
    which number is Negative
*/


    public void loop1(){

        for(int a=1; a<=10; a++){    //use for loop between1-10
           // System.out.println(a);
            if(a==0){
                System.out.println(a + " is a positive number ");
            }
            else if(a>0){
                System.out.println(a + " is a positive number");
            }
            else if(a<0 ){
                System.out.println(a+ " is a negative number");
            }
        }

           //determind positive and negative



    }



    public static void main(String[] args) {
        LoopPositiveNegative obj =new LoopPositiveNegative();
        obj.loop1();

    }


}
