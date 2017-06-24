/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idchecker.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author stephanie
 */

public class ID { 
    final int SIZE = 500;
    String[] ID = new String[SIZE];
    //int size = array.length;
    String location,gender;
    int valbygender,valbylocation,total,num;
    Scanner scan = new Scanner(System.in);
    //FileReader fr ;
    
    public int placeDetermine (String CHAR[]){
        switch (CHAR[0]) {
            case "A":  location = "TAIPEI";
            valbylocation = 1*1+0*9;
                     break;
            case "B": location = "TAIZHONG";
            valbylocation=1*1+1*9;
                     break;
            case "C":  location = "KEELUNG";
            valbylocation=1*1+2*9;
                     break;
            case "D":  location = "TAINAN";
            valbylocation=1*1+3*9;
                     break;
            case "E":  location = "GAOXIUNG";
            valbylocation=1*1+4*9;
                     break;
            case "F": location = "TAIPEI COUNTY";
            valbylocation=1*1+5*9;
                     break;
            case "G":  location = "YILAN";
            valbylocation=1*1+6*9;
                     break;
            case "H":  location = "TAOYUAN";
            valbylocation=1*1+7*9;
                     break;
            case "I": location = "JIAYI";
            valbylocation=3*1+4*9;
                     break;
            case "J":  location = "XINZHU COUNTY";
            valbylocation=1*1+8*9;
                     break;
            case "K":  location = "MIAOLI";
            valbylocation=1*1+9*9;
                     break;
            case "L":  location = "TAIZHONG";
            valbylocation=2*1+0*9;
                     break;
            case "M": location = "NANTOU";
            valbylocation=2*1+1*9;
                     break;
            case "N":  location = "CHANGHUA";
            valbylocation=2*1+2*9;
                     break;
            case "O":  location = "XINZHU";
            valbylocation=3*1+5*9;
                     break;
            case "P": location = "YUNLIN";
            valbylocation=2*1+3*9;
                     break;
            case "Q":  location = "JIAYI COUNTY";
            valbylocation=2*1+4*9;
                     break;
            case "R":  location = "TAINAN COUNTY";
            valbylocation=2*1+5*9;
                     break;
            case "S":  location = "GAOXIONG COUNTY";
            valbylocation=2*1+6*9;
                     break;
            case "T": location = "PINGDONG COUNTY";
            valbylocation=2*1+7*9;
                     break;
            case "U":  location = "HUALIAN COUNTY";
            valbylocation=2*1+8*9;
                     break;
            case "V":  location = "TAIDONG";
            valbylocation=2*1+9*9;
                     break;
            case "W": location = "JINMEN";
            valbylocation=3*1+2*9;
                     break;
            case "X":  location = "PENGHU";
            valbylocation=3*1+0*9;
                     break;
            case "Y":  location = "YANGMINGSHAN";
            valbylocation=3*1+1*9;
                     break;
            case "Z":  location = "LIANJIANG";
            valbylocation=3*1+3*9;
                     break;
            default:location = "Invalid";
                     break;
        }
        return valbylocation;
    }
    
    public String getPlace (){
        return this.location;
    }
   
    
    public void ask () {
        System.out.print("input user ID :");
    }
    
    public void datainsert(){
       int counter = 0;
       BufferedReader in = null;
       try {
            in = new BufferedReader(new FileReader("C:\\Users\\stephanie\\Desktop\\input2.txt"));
            String read = null;
            while ((read = in.readLine()) != null) {
                String[] splited = read.split("\\s+");
                    for (String part : splited) {
                        ID[counter]=part;
                        counter++;
                   }
            }
        } 
        catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        } 
        finally {
            try {
                in.close();
            } 
            catch (Exception e) {
            }
        }
   }

    public void op () {
        System.out.println("\n********************\n");
        System.out.println("1.check ID \n");
        System.out.println("0.leave \n");
        System.out.println("********************\n");
        System.out.print("enter number:");
    }
    
    public int genderDetermine (String CHAR[]){
         switch (CHAR[1]) {
            case "1":  gender = "male";
                     valbygender= 1;
                     //System.out.print(gender);
                     break;
            case "2": gender = "female";
                     valbygender=2;
                     //System.out.print(gender);
                     break;
         }
         return valbygender*8;
    }
     public String getGender (){
        return this.gender;
    }
    
    public int countID (String CHAR[]){
        int num1,num2,num3,num4,num5,num6,num7,total;
        num1= Integer.parseInt(CHAR[2])*7;
        num2= Integer.parseInt(CHAR[3])*6;
        num3= Integer.parseInt(CHAR[4])*5;
        num4= Integer.parseInt(CHAR[5])*4;
        num5= Integer.parseInt(CHAR[6])*3;
        num6= Integer.parseInt(CHAR[7])*2;
        num7= Integer.parseInt(CHAR[8])*1;
        total=num1+num2+num3+num4+num5+num6+num7;
        return total;
    }
    
    
}


