package com.OOPs_Poly;


public class Polymorphism_C_T {
    public static void main(String[] args) {
        Student_c_t s1 = new Student_c_t();
        s1.id=55;
        s1.name="Richardo";
        s1.StudentINFO(s1.id);

    }
}
/*
Polymorphism :

Poly means ‘many’ and morphism means ‘forms’
It has the ability to take an object to many forms .

Types of Polymorphism IMP
1. Compile Time Polymorphism (Static)
2. Runtime Polymorphism (Dynamic)

Compile Time Polymorphism :
 The polymorphism which is implemented at the compile time is known as compile-time polymorphism.
 Example - Method Overloading


Method Overloading : Method overloading is a technique which allows you
to have more than one function with the same function name
but with different functionality.


Method overloading can be possible on the following basis:
1. The type of the parameters passed to the function.
2. The number of parameters passed to the function.



 */
