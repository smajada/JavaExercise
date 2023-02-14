package JavaExercise;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Menu { 
    public static void main(String[] args) { //Creamos el método principal 
        Scanner scan = new Scanner(System.in); //Llamamos al scanner para recoger los inputs
        boolean isActive = true; //Creamos una variable booleana para marcar la condición del bucle

        while (isActive) { //Creamos el bucle
            System.out.print("\033[H\033[2J"); //Con estos dos system.out limpiamos la terminal en cada inicio del bucle
            System.out.flush();

            System.out.print( //Imprimimos las opciones
                    "1. Choose 5 nums and show them. \n" +
                            "2. Choose 5 nums and show them in reversed order. \n" +
                            "3. Choose 5 nums and show the average of positive nums, of negative nums and the quantity of zeros. \n"
                            +
                            "4. Write a text and show the quantity of characters it has. \n" +
                            "5. Write a text and show it in reversed. \n" +
                            "6. Wirte a text and show it without blanks. \n" +
                            "7. Write two strings and concatenate them. \n" +
                            "8. Write a text and a vocal and change all the vocals from the text to that one vocal. \n"
                            +
                            "9. Write a text and get the ASCII of the characters in that text. \n" +
                            "10. Exit \n" +
                            "Choose an option: ");

            int option = scan.nextInt(); //Pedimos al usuario la opción escogida

            switch (option) { //Según la opción escogida, llamamos al método de la clase pública "Funciones" que corresponda
                case 1:
                    Funciones.showNumbers();
                    break;
                case 2:
                    Funciones.inverseNumbers();
                    break;
                case 3:
                    Funciones.mediaNums();
                    break;
                case 4:
                    Funciones.countChars();
                    break;
                case 5:
                    Funciones.reversedText();
                    break;
                case 6:
                    Funciones.noWhiteSpaces();
                    break;
                case 7:
                    Funciones.concatStrings();
                    break;
                case 8:
                    Funciones.changeVocals();
                    break;
                case 9:
                    Funciones.showAscii();
                    break;
                case 10:
                    System.out.println("Have a nice day!");
                    isActive = false;
                    break;

                default: 
                    System.out.println("Please, choose between 1 and 10.");
            }

            try { //Creamos un control de excepciónes para configurar la espera de la terminal
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
