package JavaExercise;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Menu {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isActive = true;
        
        while (isActive) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print(
            "1. Choose 5 nums and show them. \n" +
            "2. Choose 5 nums and show them in reversed order. \n" +
            "3. Choose 5 nums and show the average of positive nums, of negative nums and the quantity of zeros. \n" +
            "4. Write a text and show the quantity of characters it has. \n" +
            "5. Write a text and show it in reversed. \n" +
            "6. Wirte a text and show it without blanks. \n" +
            "7. Write two strings and concatenate them. \n" +
            "8. Write a text and a vocal and change all the vocals from the text to that one vocal. \n" +
            "9. Write a text and get the ASCII of the characters in that text. \n" +
            "10. Exit \n" +
            "Choose an option: ");
            
            int i = scan.nextInt();


            if (i == 1) {
                funciones.showNumbers();
            }

            else if (i == 2) {
                funciones.inverseNumbers();
            }
            else if (i == 3) {
                funciones.mediaNums();
            }
            else if (i == 4) {
                funciones.countChars();
            }
            else if (i == 5) {
                funciones.reversedText();
            }
            else if (i == 6) {
                funciones.noWhiteSpaces();
            }
            else if (i == 7) {
                funciones.concatStrings();
            }
            else if (i == 8) {
                funciones.changeVocals();
            }
            else if (i == 9) {
                funciones.showAscii();
            }

            else if (i == 10) {
                System.out.println("Have a nice day!");
                break;
            }

            else {
                System.out.println("The number is not correct. Try again.");
            }

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
