package arrayPractice;

public class ArrayDemo{

    //Array length is fixed, array can hold multiple element.we can not add or remove data in array.

    String [] studentName ={"Arafat","Jobayda","Urmi","Razia"};

    //studentName is ArrayVariable. index start with 0 and lenght start with 1.
    //we store multipale valu in singla variable in Array.

    String location ="lynn";

    public void arraya(){
//        System.out.println(studentName.length);   //this is lenghth of array find
//        System.out.println(studentName[0]);
//        System.out.println(studentName[1]);
//        System.out.println(studentName[2]);
//        System.out.println(studentName[3]);
      //  System.out.println(studentName[4]);  //here if put index 4 then out of bounds for length 4
        //print 10,15,30,60
        for(String m:studentName){   //for each loop
            System.out.println(m);
        }

        for(int i=0;i<studentName.length;i++){
            System.out.println(studentName[i]);
        }



       // System.out.println(location);

    }

    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.arraya();

    }

    }



