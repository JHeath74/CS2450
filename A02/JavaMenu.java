/*Jeffory Kyle Heath
CS-2450 - GitHub
9/16/2018*/


import java.util.Scanner;

public class JavaMenu
{
   public static void main(String [] args)
         {
         
            Scanner input = new Scanner(System.in);
            String line;
            char guess;
            String Continue;
           
           do
           
           {
            JavaValidation myJavaValidation = new JavaValidation(JavaStorage.randomWord());
            
          do
            {
               System.out.print("Please enter a letter to guess: ");
               line = input.nextLine();
               line = line.toUpperCase();
               guess = line.charAt(0);
               
               myJavaValidation.checkLetter(guess);
               myJavaValidation.gamePrompt();
               System.out.println("");
            }while (myJavaValidation.winGame() == false && myJavaValidation.loseGame() == false);
           
             if(myJavaValidation.winGame())
             {
               System.out.println("Congrats, You've Won!");
             }      
               else
               {
                  System.out.println("I'm sorry you've lost.");
               }
            System.out.print("Do you want to play again(Yes / No)");
            Continue = input.nextLine();
            System.out.println(" ");
            
            }while (Continue.equalsIgnoreCase("Yes"));              
         
         }
     //  public static void menuPrompt()
// 	    {   
// 	      System.out.print("Please enter a letter to guess: )");
//        }
}