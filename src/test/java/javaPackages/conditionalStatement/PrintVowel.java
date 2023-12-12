package conditionalStatement;

public class PrintVowel {


    public void vowel() {

        //Write your name and check if there is/are any vowels there. If found print them.
        String name="Lotamahmud";

       int lengthofName= name.length();
       System.out.println(lengthofName);

      char firstLetter= name.charAt(2);  //what leeter we want to print just rite like fiveLeeter,sixLeeter
      System.out.println(firstLetter);    //and change index number.

         for(int i=0;i<name.length();i++){

             if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i'
             || name.charAt(i)=='o' || name.charAt(i)=='u'){

                 System.out.println(name.charAt(i) + " is vowel ");
             }
        }

    }

//        char b='o';
//        if(b=='a'|| b=='e'||b=='i'||b=='o'||b=='u'){
//            System.out.println("vowel");
//        }
//        else{
//            System.out.println(" not vowel");
//        }
//

    public static void main(String[] args) {
        PrintVowel obj = new PrintVowel();
        obj.vowel();
    }
}
