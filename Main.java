package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
                Scanner sc=new Scanner(System.in);
                String Name ,Designation,newEmpName , newEmpDesg;
                double Salary, newEmpSal;
                ArrayList <String> emp = new ArrayList<>();
                ArrayList <String> Desg = new ArrayList<>();
                ArrayList <Double>  Sal= new ArrayList<>();
                // ArrayList <Double> salary =new ArrayList<Double>();
                while(true){
                    System.out.println("enter 1  to show all the employee records");
                    System.out.println("enter 2Add employee ");
                    System.out.println("enter 3 to Remove employee");
                    System.out.println("enter 4 to employee details ");
                    System.out.println("enter 5 to update the employee ");
                    System.out.println("enter -1 to exit the program ");
                    System.out.println("enter choice");
                    int ch=sc.nextInt();
                    if(ch==-1){
                        System.out.println("exit the console");
                        break;}
                    else{
                        switch (ch) {
                            case 1 -> {
                                if (emp.isEmpty())
                                    System.out.println("No records found");
                                else{
                                    System.out.println("employeeName\t\t designation\t\t Salary");
                                    for (int i = 0; i < emp.size(); i++) {
                                        System.out.println("|" + emp.get(i) + "\t\t\t" + Desg.get(i) + "\t\t\t" + Sal.get(i));
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.print("Name: ");
                                Name = sc.next();
                                System.out.print("Designation: ");
                                Designation = sc.next();
                                System.out.print("Salary: ");
                                Salary = sc.nextDouble();
                                emp.add(Name);
                                Desg.add(Designation);
                                Sal.add(Salary);
                            }
                            case 3 -> {
                                System.out.println("Enter employee name and designation and salary to delete record :\n");
                                System.out.print("Name: ");
                                Name = sc.next();
                                System.out.print("Designation: ");
                                Designation = sc.next();
                                System.out.print("Salary: ");
                                Salary = sc.nextDouble();
                                if (emp.contains(Name) == Desg.contains(Designation) && Desg.contains(Designation) == Sal.contains(Salary)) {
                                    int position = emp.indexOf(Name);
                                    emp.remove(position);
                                    Desg.remove(position);
                                    Sal.remove(position);
                                    System.out.println("successfully deleted one record");
                                } else
                                    System.out.println("there is no such record in employee table : ");
                            }
                            case 4 ->{
                                System.out.println("employeeName\t\t designation\t\t Salary");
                                for (int i = 0; i < emp.size(); i++) {
                                    System.out.println("|" + emp.get(i) + "\t\t\t" + Desg.get(i) + "\t\t\t" + Sal.get(i));
                                }
                            }
                            case 5 -> {
                                System.out.println("Enter employee name and designation and salary to update record : ");
                                System.out.print("Name: ");
                                Name = sc.next();
                                System.out.print("Designation: ");
                                Designation = sc.next();
                                System.out.print("Salary: ");
                                Salary = sc.nextDouble();
                                if (emp.contains(Name) == Desg.contains(Designation) && Desg.contains(Designation) == Sal.contains(Salary)) {
                                    int position = emp.indexOf(Name);
                                    System.out.print("Enter new Employee Name: ");
                                    newEmpName = sc.next();
                                    System.out.print("Enter new Employee Designation: ");
                                    newEmpDesg = sc.next();
                                    System.out.print("Enter new Employee Salary: ");
                                    newEmpSal = sc.nextDouble();
                                    emp.set(position, newEmpName);
                                    Desg.set(position, newEmpDesg);
                                    Sal.set(position, newEmpSal);
                                    System.out.println("updated successfully");
                                } else
                                    System.out.println("there is no such record in employee table");
                            }
                            default ->  System.out.println("you entered wrong choice");
                        }
                    }}
            }
        }


