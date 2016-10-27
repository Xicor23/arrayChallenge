package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grades [] = new int[1000];
        String names[] = new String[1000];
        Scanner input = new Scanner(System.in);
        int grade;
        int count = 0;
        int sum = 0;
        String name;
        while(true)
        {
            System.out.println("Enter name or -1 to break");
            name=input.next();
            if(name.equals("-1"))
                break;
            System.out.println("Enter grade");
            grade = input.nextInt();
            names[count]=name;
            grades[count]=grade;
            sum = sum + grades[count];
            count++;

        }
        for(int i = 0; i<count;i++)
        {
            System.out.println(names[i]);
        }
        int average = sum/count;
        System.out.println(average);
    }
}
