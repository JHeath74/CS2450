/*Jeffory Kyle Heath
CS-2450 - GitHub
9/16/2018*/

import java.util.*;

  public class JavaStorage
  {
  
  public static char[][] word = {{'G','E','O','G','R','A','P','H','Y'}, 
                                 {'C','A','T','N','A','P'},
                                 {'Y','E','S','T','E','R','D','A','Y'},
                                 {'J','A','V','A','S','C','R','I','P','T'},
                                 {'T','R','U','C','K'},
                                 {'O','P','P','O','R','T','U','N','I','T','Y'},
                                 {'S','A','L','M','O','N'},
                                 {'T','O','K','E','N'},
                                 {'T','R','A','N','S','P','O','R','T','A','T','I','O','N'},
                                 {'B','O','T','T','L','E'},
                                 {'A','P','P','L','E'},
                                 {'Y','E','L','L','O','W','C','A','K','E'},
                                 {'R','E','M','O','T','E'},
                                 {'P','O','C','K','E','T'},
                                 {'T','E','R','M','I','N','O','L','O','G','Y'},
                                 {'C','R','A','N','B','E','R','R','Y'},
                                 {'C','A','T','E','R','P','I','L','L','E','R'},
                                 {'W','A','T','E','R','M','E','L','O','N'},
                                 {'F','U','N','D','A','M','E','T','A','L'},
                                 {'G','A','R','B','A','G','E'},
                                 {'A','N','T','I','C','I','P','A','T','E'}};
       
     public static char[] randomWord ()
      {
         Random rand = new Random();
         int i = rand.nextInt(word.length);
                  
         return word[i];
         
          }
     }
    
    
      
