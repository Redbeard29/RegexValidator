import java.util.Scanner;

public class Main {

    public static boolean doesStringMatch(String inputString){

        return inputString.matches(".*[a-z].*") || inputString.matches(".*[A-Z].*");
    }

    public static void main(String args[]){
        //Creating a basic program to see if an input string passes or fails an input regex
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String inputString = scanner.next();
        boolean stringPasses = doesStringMatch(inputString);
        if(stringPasses){
            System.out.println("Input passes regex");
        }
        else{
            System.out.println("Input does not pass regex");
        }

    }

}
