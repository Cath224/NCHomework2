package com.netcracker.homework.ch3.ex1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Count of employees : ");
        int countAuthorsBook = scanner.nextInt();

        Employee [] employee = new Employee[countAuthorsBook];

        for (int i = 0 ; i <employee.length ; i++){
            System.out.println("name");
            String name = scanner.next();
            System.out.println("salary");
            double salary = scanner.nextDouble();

            employee[i] = new Employee(name,salary);
        }


        outputArray(employee);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        average(employee);
        Employee highestPaidEmployee = (Employee)largest(employee);
        System.out.println("Employee with the largest salary is : " + highestPaidEmployee.getName());


    }

    public static void average(Measurable[] objects){
        double sumSalary =0 ;
        for (int i = 0; i < objects.length; i++) {
            sumSalary += objects[i].getMeasure();
        }
        System.out.println("Average salary of employees: " + sumSalary/objects.length);
    }

    public static void outputArray(Measurable[] objects){
        for (int i = 0 ; i <objects.length ; i++){
            System.out.println(i+1 + ". " +  objects[i]);
        }
    }

    public static Measurable largest(Measurable[] objects) {
        Measurable  highestPaidEmployee = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > highestPaidEmployee.getMeasure()) {
                highestPaidEmployee = objects[i];
            }
        }
        return highestPaidEmployee;
    }
}
