package com.OOPs_Constructor;
public class Parameterised_Cons {

    String name;
   int  t_id;
    Parameterised_Cons(String name, int t_id){
    this.name=name;
    this.t_id=t_id;

    }
    public void teacher_info(){
        System.out.println("Teacher name :"+this.name);
        System.out.println("Teacher id : "+this.t_id);
    }

}

