/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;


public class Employee {
    private String first_name;
    private String last_name;
    private  double monthly_salary;
    
    public Employee(String first_name, String last_name, double monthly_salary ){
          this.first_name = first_name;
          this.last_name = last_name;
          
        if (monthly_salary > 0) {
            this.monthly_salary = monthly_salary;
        } 
        else {
            this.monthly_salary = 0; 
        }
    }

    public void setFist_name(String first_name){
        this.first_name=first_name;
    }
    public void setLast_name(String last_name){
        this.last_name=last_name;
    }
    public void setMonthly_salary(double monthly_salary){
        if (monthly_salary > 0) {
            this.monthly_salary = monthly_salary;
        }
        else
         this.monthly_salary =0;

    }
    
    public String getFist_name(){
         return first_name;
        
    }
    public String getLast_name(){
        return last_name;
    }
    public double getMonthly_salary(){
        return monthly_salary;
    }
    
   
    public void giveRaise() {
       
            monthly_salary = monthly_salary+(monthly_salary*0.1);
        
    }   
    public void display(){
        
        System.out.println(getFist_name()+" "+getLast_name()+"\t\t"+getMonthly_salary());
        
        
    }
    
    
}
