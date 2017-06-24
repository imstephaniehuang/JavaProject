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
 
public class Student extends Person implements study {
     private String major;
     private String degree;// Annual salary

   public Student(String name, String major, String degree) {
        super(name);
        setMajor(major);
        setDegree(degree);
    }

    @Override
    public String getMajor() {
        return major; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMajor(String newMajor) {
       this.major = newMajor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDegree() {
        return degree;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDegree(String newDegree) {
       this.degree = newDegree;//To change body of generated methods, choose Tools | Templates.
    }
    
    public String studentAsString() {
    return String.format("student name:%s\n studies in: %s\n degree: %s",
                 nameAsString(), getMajor(), getDegree());
    }
   
   
   
 
}
