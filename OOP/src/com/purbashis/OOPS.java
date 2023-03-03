package com.purbashis;
/*
Object-Oriented Programming is a methodology to design   a program using class and objects.
* It simplifies the software development and maintenance.
 */
public  class OOPS{
    /*CLASS : IN JAVA
    Class is a user-defined data type which defines its properties and its functions.
    Class is the only logical representation of the data.
     */


    /*OBJECT : IN JAVA

    Object is a run-time entity.
    It is an instance of the class.
    An object can represent a person, place or any other item.
    An object can operate on both data members and member functions.


     */


    public static void main(String[] args) {
        Pen pen1 = new Pen();//defining an object like this
        /*
        *Here Pen is the class name .

       * here pen1 is an object .

       * new -Here, the new keyword is used to -create a new object of the 'Pen class',
        and the resulting object is assigned to the 'variable pen1'.

       * Pen()-constructor .

         */

        pen1.color="blue";// This line assigns the value "blue" to the color variable of the pen1 object.
        pen1.printColor();

        Student st =new Student();

        st.name="Purbashis";
        st.age=20;
        st.studentInfo();
        //Constructor:
        //
        // Constructor is a special type of function in java .
        /*
         It invoked automatically at the time of object creation.
         It is used to initialize the data members of new objects generally.
              *   Constructors have the same name as class or structure.
              *   Constructors don’t have a return type. (Not even void)
              *   Constructors are only called once, at object creation.

       There can be three types of constructors in Java.

         1. Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor
                (or no-argument constructor).
             It is invoked at the time of creating an object.
             If we don’t create one then it is created by default by Java.
         2. Parameterized constructor : Constructor which has parameters is called a parameterized constructor.
                  It is used to provide  different values to distinct objects.


         3. Copy Constructor : A Copy constructor is an overloaded
              constructor used to declare and initialize an object from another object.
              There is only a user defined copy constructor in Java(C++ has a default one too).


         */

/*


 */


    }
}
