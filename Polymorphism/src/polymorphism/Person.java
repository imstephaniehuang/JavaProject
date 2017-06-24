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
public class Person {
   private String name;
  
   //construct
   public Person(String name) {
      this.name = name;
   }

   public String nameAsString() {
     return String.format("name:%s\n",
            getName());
   }

   public String getName() {
      return name;
   }

}
