package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Unit unit = new Unit();
        String choose;

        System.out.println("\n\t# UNIT SELECTION #");
        System.out.println("First name");
        unit.setFname(input.next());
        System.out.println("Last name");
        unit.setLname(input.next());
        System.out.println("Father's name");
        unit.setFather(input.next());
        System.out.println("Course");
        unit.setCourse(input.next());
        System.out.println("Lesson name");
        unit.setLesson_name(input.next());
        System.out.println("Lesson units");
        unit.setLesson_unit(input.next());
        System.out.println("Do you want to show information?(yes/no)");
        choose = input.next();
        if (choose.equals("yes")){
            System.out.println("\n\t INFORMATION");
            System.out.println(unit.getFname());
            System.out.println(unit.getLname());
            System.out.println(unit.getFather());
            System.out.println(unit.getCourse());
            System.out.println(unit.getLesson_name());
            System.out.println(unit.getLesson_unit());
        }
        else if (choose.equals("no")){}
    }
}
