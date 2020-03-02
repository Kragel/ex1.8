package com.company;

public class Student {
    int rollno;
    String name;
    static String college = "GGU";
            Student(int r,String n){
            rollno = r;
            name = n;
            }
            void displey (){System.out.println(rollno+""+name+""+college);
            }
}
