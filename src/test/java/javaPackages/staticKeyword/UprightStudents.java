package javaPackages.staticKeyword;

public class UprightStudents {

    //variable type are global here

    String name;
    int ID;
    double group;
    char batch;

// Extar : creating obj we can re-use code. if we create one line obj of code, this code
   // give me access all code, or whatever code in the class i can access when create obj.
   // it is very  popular in java because one code use again and again that why shorter development time.
   // Syntex : class name obj name= new class name();


//Class-UprightStudents,  object--Shorna,Majed,Kedy,Dharti

    public static void main(String[] args) {

        UprightStudents students = new UprightStudents();  //object
        students.name = "Lota";
        students.ID = 32345;
        students.group = 5688.22;
        students.batch = 'A';

        System.out.println(students.name);
        System.out.println(students.ID);
        System.out.println(students.group);
        System.out.println(students.batch);

        UprightStudents shorna = new UprightStudents();
        shorna.name="shorna";
        shorna.ID=22222;
        shorna.group=65432.222;
        shorna.batch='C';

        System.out.println(shorna.name);
        System.out.println(shorna.ID);
        System.out.println(shorna.group);
        System.out.println(shorna.batch);

        UprightStudents xyra= new UprightStudents();
        xyra.name="xyra";
        xyra.ID=2223;
        xyra.group=6543.222;
        xyra.batch='A';

        System.out.println(xyra.name);
        System.out.println(xyra.ID);
        System.out.println(xyra.group);
        System.out.println(xyra.batch);

        UprightStudents taseen= new UprightStudents();
        taseen.name="taseen";
        taseen.ID=22224;
        taseen.group=6555.100;
        taseen.batch='D';

        System.out.println(taseen.name);
        System.out.println(taseen.ID);
        System.out.println(taseen.group);
        System.out.println(taseen.batch);

        UprightStudents tahrwat= new UprightStudents();
        tahrwat.name="tahrwat";
        tahrwat.ID=22225;
        tahrwat.group=6666.100;
        tahrwat.batch='E';

        System.out.println(tahrwat.name);
        System.out.println(tahrwat.ID);
        System.out.println(tahrwat.group);
        System.out.println(tahrwat.batch);
    }
}










