import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class helloWorld {

    public static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter some text, or '" + EXIT_COMMAND + "' to quit");

        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World, this is me");

        System.out.println("Ok, as the story#8 says, this is the implementation, so the question is \n"
        + "--> Now going to a loop! ");

        while (true) {
          System.out.println("Would you like me to say another thing? \n Yes = Y \n No  = N");
          System.out.print("> ");
          try {
          String input = br.readLine();
          System.out.println(input);

       if(input.equals("Y") || input.equals("y")){
          System.out.println("OKAY!!!");
          System.out.println("\n.....another thing....\n :D \n");
        }else if(input.equals("N") || input.equals("n")){
            System.out.println("Ok bye!");

        }else if (input.length() == EXIT_COMMAND.length() && input.toLowerCase().equals(EXIT_COMMAND)) {
            System.out.println("Exiting.");
            return;
        }else{
          System.out.println("I'm not getting your point, bye!");
        }
      } catch (IOException e) {
      e.printStackTrace();
      }
    }
    }
}
