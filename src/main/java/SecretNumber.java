import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        // prompt the user for there guess
        // and if it is wrong then print its wrong
        // aswell as letting the know if they were too high or too low
        //and then if its right then print well done
        //

        int hiddenNumber = 10;

        System.out.println("Can you guess the hidden number which is between 1 and 15 ??");

        Scanner hidden = new Scanner(System.in); // creates a scanner object

        String Number = hidden.nextLine();
        // initialises the scanner

        // convert the string to an integer

        int guess = Integer.parseInt(Number);


        if (guess < hiddenNumber) {
            System.out.println("Guess too low");
        } else if (guess > hiddenNumber) {
            System.out.println("Guess too high");
        } else {
            System.out.println("Well done you guessed right !!!");
        }

    }

}
