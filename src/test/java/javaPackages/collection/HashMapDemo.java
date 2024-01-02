package javaPackages.collection;

import java.util.HashMap;

public class HashMapDemo {

    /*
    HashMap ia an Interface but HashMap is class.HashMap implement Map
    HashMap can hold two datatypes
    HashMap hold paris value like key and value
    First one key and 2nd one value we can use
    The key should be unique and take update one
     */

    public void hashMapPractice(){
        HashMap<Integer,String> cars= new HashMap<>();  //syntex of HashMap
        //first one key and 2nd one value, we use pair value
        cars.put(1, "Toyota");  //HashMap add data use put method.HashMap take update key
        cars.put(2, "Nisaan");
        cars.put(3, "BMW");
        cars.put(4, "Lexus");
        cars.put(5, "Tesla");
        cars.put(5, "Kia");
        cars.put(6, "Honda");
        cars.put(7, "Honda");

        System.out.println(cars);
        System.out.println(cars.get(3));

        cars.remove(7);
        System.out.println(cars);

        //cars.replace(3,"Ford");

    }

    public static void main(String[] args) {
        HashMapDemo obj =new HashMapDemo();
        obj.hashMapPractice();
    }
}
