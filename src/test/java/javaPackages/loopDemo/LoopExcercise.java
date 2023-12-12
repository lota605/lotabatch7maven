package javaPackages.loopDemo;

public class LoopExcercise {
    /*
    with the help of gitbash push the code to git (local) and github (central repo)
       whit is loop?
       Ans:Repearting a block of code..``

     */

    //Loop 4 typs :1.While loop  2.for loop  3.Do-while loop  4.foreach loop

    public void loopIntroduction(){
        //print 1-10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);


    }

    public void whileLoop() {

        //print 10-50 using while loop

        int a = 10;     //initialization variable
        while (a <= 50) {     //condition and block of code
            System.out.println(a);
            a++;   //increase by 1

            /*
            a++
            a=10+1   we use here a=a+1
            a=11
            a=11+1
            a=12
             */


        }

        System.out.println("..............");
        //print 50-10 using while loop

        int b = 50;

        while (b >= 10) {     //condition and block of code decrement
            System.out.println(b);

            b--;       //decrement by 1

            /*
            b=b-1, b=50-1, b=49, b=49-1, b=48

             */
        }

        System.out.println("..............");
        //print 1-50 in 2 intervale

        int c = 1;
        while (c <= 50) {     //condition and block of code decrement
            System.out.println(c);
            c = c + 2;     //increment by 2
        }
        /*
        c=c+2
        c=1+2
        c=3
        c=3+2
        c=5
        c=5+2
        c=7
         */
    }


    public static void forloop(){

        for(int a=1;a<=10;a++){   //here initialization variable,condition and increment together in forloop.
            System.out.println(a);
        }
        //for(int a =10; a>=1;a=a-2) decrement by 2
        //for(int a=5;a>=1;a--)   here print 5 to 1


    }


    public void dowhileloop() {
        //Do-while  loop it willrun the block at lest 1 time.
        //print 5 to 10 do-while loop

       int d = 5;
        do {         //go and print this methode first then other ..
            System.out.println(d);
            d++;
        }
        while(d<=9);

    }



    public static void main(String[] args) {
        LoopExcercise obj =new LoopExcercise();
       // obj.loopIntroduction();
        obj.whileLoop();
      // forloop();
       // obj.dowhileloop();
    }




}
