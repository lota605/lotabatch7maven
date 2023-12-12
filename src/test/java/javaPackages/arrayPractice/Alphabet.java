package javaPackages.arrayPractice;

public class Alphabet {

    public void printAllAlphabet(){

        //Write a program to print all alphabets from a to z.

        for(char i='a'; i<='z'; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Alphabet obj =new Alphabet();
        obj.printAllAlphabet();
    }

}
