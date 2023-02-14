package JavaExercise; //Incluimos el archivo dentro de la carpeta

import java.util.*; //Importamos la librería "util"

public class Funciones { // Creamos una clase pública
    // Ejercicio a
    public static void showNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] myNums = new int[5]; // Creamos una matriz de 5 números
        System.out.println("Write five numbers: "); // pedimos el número que deseemos insertar

        for (int i = 0; i < 5; i++) { // inicializamos el bucle que empiece por 0, se pare en 5 y añada 1 cada vez
            System.out.print("Number " + (i + 1) + ": "); // imprimimos el número que se le pide al usuario
            myNums[i] = scan.nextInt(); // recogemos el texto del usuario
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
    // Ejercicio C
    public static void mediaNums() {
        Scanner scan = new Scanner(System.in);

        int Nums = 0;
        int myPosNums = 0; // Creamos una variable para albergar los posivos
        int myNegNums = 0; // Creamos una variable para albergar los negativos
        int myZeros = 0; // Creamos una variable para albergar los 0
        int countPos = 0; // Creamos una variable para ir sumando los positivos que aparezcan
        int countNeg = 0; // Creamos una variable para ir sumando los negativos que aparezcan

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

        // Creamos controles de excepción por si no se indican algún tipo de número y da
        // error
        try {
            System.out.println("The average of the positive numbers is: " + myPosNums / countPos);

        } catch (ArithmeticException e) {
            System.out.println("There's no positive numbers");
        }

        try {
            System.out.println("The average of the negative numbers is: " + myNegNums / countNeg);

        } catch (Exception e) {
            System.out.println("There's no negative numbers");
        }
        System.out.println("The amount of zeros are: " + myZeros);
    }

    // Ejercicio D
    public static void countChars() {
        Scanner scan = new Scanner(System.in);

        int chars = 0; //Creamos una variable de tipo entero

        System.out.print("Write a text: "); 
        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) //Bucle for que empieza con i en 0, va hasta la longitud del texto y suma 1 cada vez
            chars++; //Suma un carácter

        System.out.println("The amount of characters in that string are: " + chars); //Muestra el nº de caracteres
    }

    // Ejercicio E
    public static void reversedText() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.println("Your reversed string is: ");

        for (int i = text.length() - 1; i == 0; i--) // Creamos un bucle que empiece en la longitud del texto - 1, vaya hasta 0 y reduzca 1 cada vez
            System.out.print(text.charAt(i)); // Imprime cada uno de los caracteres

    }

    // Ejercicio F
    public static void noWhiteSpaces() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.println("Your trimmed string is: " + text.replace(" ", ""));
        //Usamos el método replace que borre los espacios
    }

    // Ejercicio G
    public static void concatStrings() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your first name: ");
        String fName = scan.nextLine();

        System.out.print("Write your last name: ");
        String lName = scan.nextLine();

        System.out.println("Your concatenated strings are: " + fName.concat(lName));
        //Usamos el método concat para juntar lName con fName
    }

    //Ejercicio H
    public static void changeVocals() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.print("Choose a vocal: ");
        String vocal = scan.nextLine();

        System.out.println("Your changed string is: " + text.replaceAll("[AaEeIiOoUu]", vocal));
        //Usamos el método replaceAll para que, mediante un regex de todas las vocales (mayus y minus), se cambien por la vocal elegida
    }

    //Ejercicio I
    public static void showAscii() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a text: ");
        String text = scan.nextLine();

        System.out.print("Your ASCII characters are: ");

        for (int i = 0; i < text.length(); i++) { //Creamos un bucle que empiece en i=0, vaya hasta la longitud del texto y añada 1 cada vez

            char ch = text.charAt(i); //Creamos una variable ch que sea el carácter que hay en i
            int ascii = ch; //transformamos ese carácter en número

            System.out.print(ascii); //imprimimos el número ASCII

            if (i < text.length() - 1) { //Vamos imprimiendo una coma después de cada número, excepto el último
                System.out.print(", ");
            }
        }
        System.out.print("."); //Imprimimos un punto final
    }
}
