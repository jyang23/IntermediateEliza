import java.util.Scanner;
import java.io.*;

public class Main {


    public static void response()
    {
        System.out.println("you are feeling great");
    }

    public static void main(String[] args) {

        System.out.println("Hello, I am Eliza, what is your problem?");

        Scanner in = new Scanner(System.in);
        String input = "";
        boolean flag = true;

        while(flag)
        {
            System.out.println("Enter your Response here or Q to quit:");
            input = in.nextLine();
            input = input.toLowerCase();

            if(input.equals("Q")||input.equals("q")||input.equals("bye")||input.equals("I am feeling great"))
            {
                response();
                flag = false;
            }
            else
            {
                input.replace("i","you");
                input.replace("me","you");
                input.replace("my","you");
                input.replace("am","you");
                System.out.println("Why do you say "+input+"?");
            }
        }
        System.out.println("Have a nice day and feel better!!!");



    }
}
