/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author stephanie
 */
public class Staff extends Person implements work {
    
    private String department;
    private double salary;
    
    public Staff(String name, double salary, String department) {
        super(name);
        setSalary(salary);
        setDepartment(department);
    }

    @Override
    public String getDepartment() {
        return department;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDepartment(String newDepartment) {
       this.department = newDepartment; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalary() {
         return salary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalary(double newSalary) {
         if(newSalary >= 0.0) {
         salary = newSalary;
      }//To change body of generated methods, choose Tools | Templates.
    }
   
    public String staffAsString() {
    return String.format("staff name:%s\n works in: %s\n salary:%s",
                 nameAsString(), getDepartment(), getSalary());
    }
  
}
