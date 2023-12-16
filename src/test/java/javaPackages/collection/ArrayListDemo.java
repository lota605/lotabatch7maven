package javaPackages.collection;

import java.util.ArrayList;

public class ArrayListDemo {

    /*
    List is an Interface and ArrayList implements List
    ArrayList is not fixed, it is dynamic
    ArrayList can hold duplicate value.we can add, remove, excess,any time .
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
        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayListDemo obj =new ArrayListDemo();
        obj.arraylistPractice();
    }
}
