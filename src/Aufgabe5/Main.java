package Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Manuel", 12345, 1992));
        students.add(new Student("Christof", 23456, 1994));
        students.add(new Student("Josef", 34567, 1996));

        for (Student item : students){
            System.out.println(item.toString());
        }

    }

}
