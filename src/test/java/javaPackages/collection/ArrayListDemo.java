package javaPackages.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    /*
    List is an Interface and ArrayList implements List
    ArrayList is not fixed, it is dynamic
    ArrayList can hold duplicate value.we can add, remove, excess,any time .
    ArrayList follows insertion order
     */

    public void arraylistPractice(){

        //array is fixed we can not add, remove any data in array.we creat array here
      //  String [] name={"lota","tareq","tahrwat","taseen"};
       // System.out.println(name.length);

        ArrayList<String> name= new ArrayList<>();   //ArrayList syntex

        boolean isEmptyOrNot = name.isEmpty();  //befor add data, so outcome true
        System.out.println(isEmptyOrNot);

        name.add("lota");      //add data in arraylist
        name.add("tareq");
        name.add("taseen");
        name.add("tahrwat");
        System.out.println(name);
        System.out.println(name.size());   //ArrayList for size use variablename.size


    boolean EmptyOrNot = name.isEmpty();   //after add data, so outcome is false
    System.out.println(EmptyOrNot);


    name.add("taseen");    //ArrayList hold doubal value.taseen use 2 times
    name.add("Xtra");
    System.out.println(name);

    name.remove("tareq");    //remove value use variablename.remove
    System.out.println(name);

    name.add(1,"tarwq");  //when we want to excess any ArrayList use index number.
    System.out.println(name);

    //when we want every element print my own way then use for loop
    //    for(int i=0; i<name.size(); i++){
    //        System.out.println(name.get(i));
     //   }

        //for each loop use String
        for(String l : name);
        System.out.println("print all name");

    }

    public void arrayListPractice2(){

        ArrayList<Integer> number = new ArrayList<>();  //Integer is wrapper Class
       boolean isEmptybefore = number.isEmpty();  //before add data it is empty, so output come true.
       System.out.println(isEmptybefore);


        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(80);
        number.add(90);

        boolean isEmptyAfter = number.isEmpty();  //After add data it is not empty, so output come false.
        System.out.println(isEmptyAfter);

        int size =number.size();    //size of ArrayList variable name.size
        System.out.println("Size of the number is  " + size);

        System.out.println(number);   //size and length start with 1

        int thiredNumber = number.get(2);   //access use index number,so output come 60
        System.out.println(thiredNumber);

        int remove = number.remove(2);  //remove element use index number
        System.out.println(number);

        number.add(60);  //add again 60, but it come at last
        System.out.println(number);

        number.add(2,60);  //here 60 add in order like before
        System.out.println(number);

       boolean ninetyisThereOrNot =  number.contains(90);  //contains method return boolean data type
        System.out.println(ninetyisThereOrNot);

        //collection is anethere class

        Collections.shuffle(number);  //shuffle means rendome output come, like mixe not order
        System.out.println(number);

        Collections.sort(number);   //sort means in order coming outcome
        System.out.println(number);

        Collections.reverse(number);  //here reverse come output like backword
        System.out.println(number);

        Collections.sort(number);   //sort means in order coming outcome, use aganine for fixed it
        System.out.println(number);

        int minimunNumber = Collections.min(number);  //here print minimun number);
        System.out.println(minimunNumber);

        int maximunNumber = Collections.max(number);  //oupcome maximun number
        System.out.println(maximunNumber);

//for loop accessing the List and print all element of ArrayList

        for(int i=0; i<number.size(); i++){    //this is ArrayList that why use get method for excess all value
            System.out.println("The ArrayList Contains " + number.get(i));  //print my own way in for loop

            //for each loop
            for(Integer n : number){  //All number i am puting in to n
                System.out.println(number);  //automatic go each of the value and print it
            }

        }






    }

    public static void main(String[] args) {
        ArrayListDemo obj =new ArrayListDemo();
        obj.arraylistPractice();
       // obj.arrayListPractice2();
    }
}
