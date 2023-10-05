import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
class Conversation {
  public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    /*asks user for no. of rounds */

    System.out.print("How many conversation rounds would you like to have?");
    int rounds = input.nextInt();
    
    /*initializes count */

    int count = 1;

    /*creates static arrays for canned responses, mirror inputs, mirror outputs */

    String[] responses = {"Ohhh.", "Mhm.", "That's so interesting!", "Really?", "Tell me more."};
    String[] mirrorinputs = {"I", "me", "am", "you", "my", "your"};
    String [] mirroroutputs = {"you", "you", "are", "I", "your", "my"};

    /*creates array to store user responses*/

    String[] userresponses = new String[rounds];

   /*starts conversation*/

    System.out.print("Hi there!  What's on your mind?");
    
   /*initializes loop that runs for number of rounds input by user */

    while (count <= rounds)  {
      
      /*stores user responses in the array */

      userresponses[count] = input.nextLine();

      /*splits user reponse in parts and stores them in an array*/

      String[] parts = userresponses[count].split(" ");
      
      /*how do i compare the elements of the two arrays? can i apply linear searching to two arrays? why is the program not running? */
      
      /*prints canned response*/

      System.out.println(responses[random.nextInt(5)]);
       count++;
    }
    

  }
}
