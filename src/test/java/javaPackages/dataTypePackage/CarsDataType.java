package dataTypePackage;

public class CarsDataType {


   String name="Toyota" ;
   short year =2020;
   String color= "Block";
   boolean backCamera=true;
   String model="Rave4";
   byte wheels=4;  //can hold data 0-127
   int regNo=8205842;   //can hold data 0-2147483647
   long VinNo=8240582345802L;
   float milage=5000.4343f;

   /*
   byte=0-127
   short=0-32767
   int=0-2147483647

    */




    public static void main(String[] args) {
        short id=101;
        System.out.println(id);

        byte roll=(byte)31379;  //type casting
        System.out.println(roll);

        int myRegNo=4845454;

    }

}
