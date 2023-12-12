package variableTypePackage;

public class VariableTypes {

    /*There are three types of variables
    1. instance or global variable---The variables declares inside the class are called instance variable
    2. local variable...The variables declare inside the method are called local variable. local variable born
     inside the  method and die inside the method
     3. Static variable/methods--static variables belong to the class.this is called class variable.we create when
     we see the variable are common to all object.
     ##class can hold method and variable.method can hold variable and statements
     */

    byte age=100;  //we both declare and initialize/define.this is global/instance variable.
    short checkingAccount;  //we declare the variable



    //System.out.print(); is called statement and use  variable.


    public void study(){  //other name is method is Function.method can hold variable, statements

        System.out.println(age);
        checkingAccount= 32767;   //initialize/define the variable. and this is global/instance variable.
        System.out.println(checkingAccount);
        boolean snooringInTheClass=true;


    }




    public static void main(String[] args) {      //method can hold variable and statement
        VariableTypes obj=new VariableTypes();
        obj.study();

        String name="Lota";  //this is local variable


    }




}



