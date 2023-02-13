package JavaExercise;
import java.util.*;

public class funciones {
     // Ejercicio a
     public static void showNumbers() {
        int[] myNums = new int[5]; // Creamos una matriz de 5 números
        Scanner scan = new Scanner(System.in);
        System.out.println("Write five numbers: "); // pedimos el número que deseemos insertar

        for (int i = 0; i < 5; i++) { // inicializamos el bucle que empiece por 0, se pare en 5 y añada 1 cada vez
            System.out.print("Number " + (i + 1) + ": ");
            myNums[i] = scan.nextInt();
        }

        System.out.print("The numbers inside of the array are: ");

        for (int i = 0; i < myNums.length; i++) { // Creamos un bucle para imprimir los números junto a una coma
            System.out.print(myNums[i]);
            if (i < myNums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("."); // Finaliza la impresión de los números con un punto
    }

    // Ejercicio b
    public static void inverseNumbers() {
        int[] myNums = new int[5]; // Creamos una matriz de 5 números
        Scanner scan = new Scanner(System.in);
        System.out.println("Write five numbers: "); // pedimos el número que deseemos insertar

        for (int i = 0; i < 5; i++) { // inicializamos el bucle que empiece por 0, se pare en 5 y añada 1 cada vez
            System.out.print("Number " + (i + 1) + ": ");
            myNums[i] = scan.nextInt();
        }

        System.out.print("The numbers inside of the array are: ");

        for (int i = myNums.length - 1; i >= 0; i--) { // Creamos un bucle para imprimir de forma inversa los números
            System.out.print(myNums[i]);
            if (i < myNums.length) { // junto a una coma
                System.out.print(", ");
            }
        }
        System.out.print("."); // Finaliza la impresión de los números con un punto

    }

    public static void mediaNums() {
        Scanner scan = new Scanner(System.in);

        int Nums = 0;
        int myPosNums = 0; // Creamos una matriz de 5 números para colocar los posivos
        int myNegNums = 0; // Creamos una matriz de 5 números para colocar los negativos
        int myZeros = 0; // Creamos una matriz de 5 números para colocar los 0
        int countPos = 1;
        int countNeg = 1;

        System.out.println("Write five numbers: "); // pedimos el número que deseemos insertar

        for (int i = 0; i < 5; i++) { // inicializamos el bucle que empiece por 0, se pare en 5 y añada 1 cada vez
            System.out.print("Number " + (i + 1) + ": ");
            Nums = scan.nextInt();

            if (Nums > 0) { // Si los números son positivos
                myPosNums = myPosNums + Nums;
                countPos++;
            }
            
            else if (Nums < 0) { // Si los números son negativos
                myNegNums = myNegNums + Nums;
                countNeg++;
            }
            
            else { // Si hay ceros, sumamos 1
                myZeros++;
            }
        }
        
        System.out.println("The average of the positive numbers is: " + myPosNums / countPos);
        System.out.println("The average of the negative numbers is: " + myNegNums / countNeg);
        System.out.println("The amount of zeros are: " + myZeros);
    }

    public static void countChars() {
        Scanner scan = new Scanner(System.in);

        int chars = 0;

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++)
            chars++;

        System.out.println("The amount of characters in that string are: " + chars);
    }

    public static void reversedText() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.println("Your reversed string is: ");

        for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text.charAt(i));

    }

    public static void noWhiteSpaces() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.println("Your trimmed string is: " + text.replace(" ", ""));
    }

    public static void concatStrings() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your first name: ");
        String fName = scan.nextLine();

        System.out.print("Write your last name: ");
        String lName = scan.nextLine();

        System.out.println("Your concatenated strings are: " + fName.concat(lName));
    }

    public static void changeVocals() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.print("Choose a vocal: ");
        String vocal = scan.nextLine();

        System.out.println("Your changed string is: " + text.replaceAll("[AaEeIiOoUu]", vocal));
    }

    public static void showAscii() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.print("Your ASCII characters are: ");

        for (int i = 0; i < text.length(); i++) {
            
            char ch = text.charAt(i);
            int ascii = ch;

            System.out.print(ascii);

            if (i < text.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(".");
    }
}
