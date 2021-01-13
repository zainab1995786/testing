/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author wcom
 */
public class Userinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Your Age");
        
        int age;
        age=userInput.nextInt();
         System.out.println("Age is" +age);
        
        System.out.println("Enter first name");
        String name;
         name=userInput.next();
         System.out.println("Name is" +name);
         
           System.out.println("Enter last name");
        String lastname;
         lastname=userInput.next();
         System.out.println("Name is" +lastname);
         
          System.out.println("Enter Your Height");
        double height;
         height=userInput.nextDouble();
         System.out.println("Height is" +height);
         
          System.out.println("Enter Your Grade");
        char ch;
          ch=userInput.next().charAt(0);
           System.out.println("Grade is "+ch);
                
    }
    
}
