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




public class PersonTest  {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Person newperson = new Person("LLL");
       Student newstudent = new Student("aaa","economy","bachelor");
       Staff newstaff = new Staff("aaa",500,"bachelor");
       TeacherAssistant TA = new TeacherAssistant ("bbb","economy","master","math",900,"math");
       
        System.out.println(newperson);
        System.out.println();
        System.out.println(newstudent);
        System.out.println();
        System.out.println(newstaff);
        System.out.println();
        System.out.println(TA);
       

    }

}
