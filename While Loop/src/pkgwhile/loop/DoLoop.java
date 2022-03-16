/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.loop;

import java.util.Scanner;

/**
 *
 * @author Jess
 */
public class DoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Jess's While Loop Calculator");
        Scanner keyboard = new Scanner(System.in);
        String answer;
       
        do{
            
        
            System.out.println("Perform all the operators"); 
            
            System.out.println("Enter the number: ");
            double number = keyboard.nextDouble();

            System.out.println("Enter the number: ");
            int y = keyboard.nextInt();

            System.out.println("Enter the number: ");
            int b = keyboard.nextInt();
            
            System.out.println("Enter the number: ");
            int c = keyboard.nextInt(); 
            
            System.out.println("Enter the number: ");
            int d = keyboard.nextInt();
            
            System.out.println("Enter the number: ");
            int f = keyboard.nextInt();
            
            double result = number + y + b - c * d / f;
            System.out.println("equals to: ");
            System.out.println(y+b-c*d/f);
            System.out.println("Do you want to calculate another result? Yes or No");
            answer = keyboard.next();         
        }
        while(answer.equals("Yes"));
    }
    
}

