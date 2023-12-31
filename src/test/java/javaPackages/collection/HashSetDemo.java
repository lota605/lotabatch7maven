package javaPackages.collection;

import java.util.HashSet;

public class HashSetDemo {
    /*
    HashSet is an Interface and HashSet is a class.HashSet implements Set.
    HashSet does not allow hold duplicate value
    HashSet does not follow insertion order

     */

    public void HashDetPractice(){

        HashSet <String> cars =new HashSet<>();  //syntex of HashSet

        cars.add("Rikshaw");  //add data in HashSet
        cars.add("Morir Tin");
        cars.add("CNG");
        cars.add("Tomtom");
        cars.add("Legona");
        cars.add("Tomtom");
        System.out.println(cars);

       int CarSize = cars.size();  //we add two times but it not come two time.so oupput come 5
        System.out.println(CarSize);

        boolean honda = cars.contains("honda");  //output come false bcz honda is not there
        System.out.println(honda);

        boolean Legona = cars.contains("Legona");  //output come true bce Legona is there
        System.out.println(Legona);



        //Add integer valu for set.set means lots of data more than ArratList
        HashSet <Integer> number =new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(5);
        number.add(8);
        number.add(9);
        System.out.println(number);

        int numberSize = number.size();  //we add two times 3000 but it not come two time.so output come 5
        System.out.println(numberSize);

       /* for(int i=0; i<cars.size();i++){
            if(cars.contains("Legona")){
                System.out.println("Legona is there");
                break;    //breaking the loop if finds the expected value
            }
            else{
                System.out.println("Legona is not there");
            }

        }
*/
        //we can finde which number is there or not this way
      for(int i=1;i<10;i++){
          if(number.contains(i)){
              System.out.println(i + " is There");
          }
          else{
              System.out.println(i + " Is not There");
          }
      }

    }


    public static void main(String[] args) {
        HashSetDemo obj =new HashSetDemo();
        obj.HashDetPractice();
    }
}
