1/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idchecker.main;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stephanie
 */
public class IDCheckerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       boolean retry = true;
       int amount ,i;
       final int SIZE = 500;
       String[] all_ID= new String[SIZE];
       
       String IDnumber,user_place,user_gender,user_num;
       String regex = "^[a-zA-Z0-9]+$";
       Pattern pattern = Pattern.compile(regex);
       ID idcheck = new ID();
       Scanner scan = new Scanner(System.in);
      
       StringBuffer right_ID = new StringBuffer();
       StringBuffer false_ID = new StringBuffer();
      
       do {
           idcheck.op();
           user_num = scan.nextLine();
           while (user_num.contentEquals("1")){
             
               idcheck.datainsert();
 
                for (i =0;i<=499;i++){
                    all_ID[i] = idcheck.ID[i];
                    String idchar[]=  all_ID[i].split("(?!^)");
                    Matcher matcher = pattern.matcher(all_ID[i]);
                    
                    if(true && idchar.length == 10) {
                            int total = idcheck.genderDetermine(idchar)+ idcheck.countID(idchar)+idcheck.placeDetermine(idchar)+Integer.parseInt(idchar[9]);
                            user_place = idcheck.getPlace();
                            user_gender = idcheck.getGender();
                            
                            if (total%10==0){ 
                                right_ID.append(all_ID[i]+"\n");
                            }
                            else {
                                 false_ID.append(all_ID[i]+"\n");
                            }
                    }
                    else {
                        false_ID.append(all_ID[i]+"\n");
                    }
                    
                }
              
                FileWriter fw = new FileWriter("C:\\Users\\stephanie\\Desktop\\outputright.txt"); 
                    fw.write(right_ID.toString() );
                fw.close();
                
                fw = new FileWriter("C:\\Users\\stephanie\\Desktop\\outputwrong.txt"); 
                    fw.write(false_ID.toString() );
                fw.close();
                             
                idcheck.op();
                user_num = scan.nextLine();
                if (user_num.contentEquals("0")){
                    retry = false;
                }
                break;
           }
       }
       while (retry);
    }
    
}
    
        
    

