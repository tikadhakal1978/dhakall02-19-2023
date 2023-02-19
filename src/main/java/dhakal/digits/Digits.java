/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.digits;

/**
 *
 * @author tikad
 */
public class Digits {

  public static void main(String[] args) {
      
 //public static void displayDigits (int num){
       
        
         int a = 10;
         int b = 3;
         int remainder = a%b;
         System.out.println(remainder);
          
  
         int quotient = a/b; 
        int Intpart=quotient;
         System.out.println(Intpart);
  }
         public static void displayDigits (int num){
         
              if (num < 1|| num > 99999){
          throw new
         IllegalArgumentException ("Number must be between 1 and 99999");
              }
        String digits ="";
        while (num >0){
            
            int digit=num % 10;
            digits=digit + "     " + digits;
             num /= 10;
            
        }
          
          System.out.println(digits);
          
       
      }
}
        