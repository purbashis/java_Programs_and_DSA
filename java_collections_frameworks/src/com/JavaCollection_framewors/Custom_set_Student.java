package com.JavaCollection_framewors;

import java.util.Objects;

public class Custom_set_Student {
    String name ;
    int roll;

    public  Custom_set_Student(String name, int roll){
        this.name=name;
        this.roll=roll;//plain old java obj (pojo)
    }
//applying to string generates -> toString
    @Override
    public String toString() {
        return "Custom_set_Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    //generates -> hashcode() and equals()  for checking the unique roll number

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Custom_set_Student that = (Custom_set_Student) o;
        return roll == that.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
