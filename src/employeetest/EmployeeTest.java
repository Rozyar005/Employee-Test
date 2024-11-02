/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;

import java.util.Scanner;
public class EmployeeTest {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee obj=new Employee("Rozyar","Jamal",200000);
        Employee obj2=new Employee("Yusra","Mohammad",300000);

        System.out.println("Name \t\t\tYearly Salary");
        System.out.println("-------------------------------------------------------");
        obj.display();
        obj2.display();
        System.out.println("-------------------------------------------------------");
        System.out.println("----------Your Salary after 10% Raise Yahoo------------");
        System.out.println("-------------------------------------------------------");
        obj.giveRaise();
        obj2.giveRaise();
        obj.display();
        obj2.display();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Do you wanna Modify the Informations? 1.yes 0.No");
        int op=input.nextInt();
        
        while(op!=0){
            System.out.println("Set The First Name for the first Employee : ");
            String fName1=input.next();
            obj.setFist_name(fName1);
            System.out.println("Set The Last Name for the first Employee : ");
            String lName1=input.next();
            obj.setLast_name(lName1);
            System.out.println("Set The Monthly Salary for the first Employee : ");
            double mS1=input.nextDouble();
            mS1=mS1*12;
            obj.setMonthly_salary(mS1);

            System.out.println("Set The First Name for the second Employee : ");
            String fName2=input.next();
            obj2.setFist_name(fName2);
            System.out.println("Set The Last Name for the second Employee : ");
            String lName2=input.next();
            obj2.setLast_name(lName2);
            System.out.println("Set The Monthly Salary for the second Employee : ");
            double mS2=input.nextDouble();
            mS2=mS2*12;
            obj2.setMonthly_salary(mS2);

            
        System.out.println("Name \t\t\tYearly Salary");
        System.out.println("-------------------------------------------------------");
            obj.display();
            obj2.display();
        System.out.println("-------------------------------------------------------");
        System.out.println("----------Your Salary after 10% Raise Yahoo------------");
        System.out.println("-------------------------------------------------------");
            obj.giveRaise();
            obj2.giveRaise();
            obj.display();
            obj2.display();
            
                  System.out.println("Do you wanna Modify the Informations? 1.yes 0.No");
                  op=input.nextInt();
        }
        System.out.println("Good Night!^-^");  
        
    }}
    

