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
public class TeacherAssistant extends Student implements work {
    
    private String course;
    private double salary;
    private String department;
    
    public TeacherAssistant(String name, String major, String degree, String department, double salary, String course) {
        super(name, major, degree);
        setSalary(salary);
        setCourse(course);
    }

    @Override
    public String getDepartment() {
         return department; //To change body of generated methods, choose Tools | Templates.
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
      } //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCourse (String newCourse) {
       this.course = newCourse; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String TAAsString() {
    return String.format("TA name:%s\n studies in: %s\n degree: %s\n works in: %s\n salary:%s",
                studentAsString(), getDepartment(), getSalary());
    }
    
   
  
    
    
}
