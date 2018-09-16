/*Jeffory Kyle Heath
CS-2450 - GitHub
9/16/2018*/

public class JavaValidation
{
   private char[] word;
   private char[] arrayGuess;
   private char[] userWord;
   private int tries;
   int i;
   
   //Constructor that stores the guessed word
   public JavaValidation(char[] word)
   {
      this.userWord = new char[word.length];
      for(i = 0; i < word.length; i++)
      {
         userWord[i] = '-';
      }
      this.word = word;
     
     tries = 0;
     
      this.arrayGuess = new char [26];
       for(i = 0; i < 26; i++)
      {
         arrayGuess[i] = '-';
      }
   }
   
  //The method that stores the letter
   private boolean getarrayGuess(char guess)
   {int j = -1;
      for(i=0; i < 26; i++)
      {
         if(arrayGuess[i] == guess)
         {
            return false;
         }
         
         if(j == -1 && arrayGuess[i] == '-')
         {
           j = i;
           break;
         }
        
      }
      
      arrayGuess[j] = guess;
              
      return true;
   }
   
   //the method that determies if the guess is in the random letter
   public boolean checkLetter(char guess)
   {boolean correct = false;
      if(getarrayGuess(guess) == false)
      {
         return false;
      }
      
         for (int i = 0; i < word.length; i++)
         {
               if(word[i] == guess)
               {
                  userWord[i] = guess;
                  correct = true;
               }
         }
         if(correct == false)
            {
               tries++;
            }
              return true;
      }
     //The method that states if the game was won
              public boolean winGame()
               {
            for(i = 0; i < userWord.length; i++)
               {              
                  if(userWord[i] == '-') 
                  {
                     return false;
                  }
                        
               }
                     return true;
              }
               
     // the method that shows if the game was lost
             public boolean loseGame()
               {
                  if(tries >= word.length)
                  {
                     return true;
                  }
                  
                  return false;
                        
               }
     
   // The display the player see's.
     public  void gamePrompt()
     {
               
             System.out.printf("%nLetters in word: %d%n", word.length);
             
             System.out.printf("Guesses left: %d%n", word.length-tries);
             
             System.out.println(userWord);
             
             System.out.println(arrayGuess);
             
               
     }
           //  System.out.println(" ");
      
}