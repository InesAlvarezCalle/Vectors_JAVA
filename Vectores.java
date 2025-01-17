import java.lang.reflect.Array;
import java.util.Arrays;

public class Vectores {

    /**
     * 1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
     * muestre todos los valores y el resultado de su suma.
     */
    public static void vector1() {
        int[] vector = new int[10];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduce un número: ");
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El vector en la posición: " + i + " és " + vector[i]);
            suma = suma + vector[i];
        }
        System.out.println("La suma total es: " + suma);
    }

    /**
     * 2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego
     * lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
     */
    public static void vector2() {
        int[] vector = new int[10];
        int max = 0, min = 1000;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduce un número: ");
        }

        max = vector[1];
        min = vector[1];

        for (int j : vector) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("El valor máximo que has introducido es: " + max);
        System.out.println("El valor mínimo que has introducido es: " + min);
    }

    /**
     * 3. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego
     * muestre por separado la suma de todos los valores positivos y la suma de los valores negativos.
     */
    public static void vector3() {
        int[] vector = new int [20];
        int positivos = 0, negativos = 0;
        int sumaPositivos = 0, sumaNegativos = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduce un número: ");
        }

        for (int j : vector) {
            if (j > 0){
                positivos++;
                sumaPositivos = sumaPositivos + j;
            }else if (j < 0){
                negativos++;
                sumaNegativos = sumaNegativos + j;
            }
        }
        System.out.println("Hay un total de " + positivos + " números positivos.");
        System.out.println("La suma total de los positivos es: " + sumaPositivos);
        System.out.println("Hay un total de " + negativos + " números negativos.");
        System.out.println("La suma total de los negativos es: " + sumaNegativos);
    }

    /**
     * 4. Programa que guarde los 100 primeros números pares en un vector. Después mostrará la suma
     * de los últimos 30 números guardados.
     */
    public static void vector4() {
        int[] vector = new int[100];
        int numero = 2, suma = 0;

        for (int i = 0; i < vector.length * 2; i++) {
            vector[i] = numero;
            numero+=2;
        }

        for (int i = vector.length -30; i < vector.length; i++) {
            suma += vector[i];
        }

        System.out.println("Los 100 primeros números pares són: " + Arrays.toString(vector));
        System.out.println("La suma de los 30 últimos és: " + suma);
    }

    /**
     * 5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego
     * lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
     */
    public static void vector5() {
        int[] vector = new int[20];
        int suma = 0, media;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = Leer.leerEntero("Introduce un número: ");
        }

        for (int j : vector) {
            suma += j;
        }

        media = suma / vector.length;

        System.out.println("La media de todos los valores introducidos és: " + media);
    }

    /**
     *6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba
     * M en todas sus posiciones y lo muestre por pantalla.
     */
    public static void vector6() {
        int n = Leer.leerEntero("Introduce la longitud de la array: ");
        int m = Leer.leerEntero("Introduce otro valor numérico: ");
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = m;
        }

        System.out.println(vector);
    }

    /**
     * 7. Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1,
     * 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
     */

    public static void vector7() {
        int[] vector = new int[55];
        int iteraciones = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                vector[iteraciones] = i;
                iteraciones++;
            }
        }

        System.out.println(vector);
    }

    /**
     * 8. Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distntas
     * opciones:
     * a. Mostrar valores.
     * b. Introducir valor.
     * c. Salir.
     * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
     * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
     * que el usuario elija la opción ‘c’ que terminará el programa.
     */

    public static void vector8() {
        int[] numeros = new int[10];
        int  v, p;
        String opc;
        boolean permiso = false;

        do{
            System.out.println("A. Mostrar valores");
            System.out.println("B. Introducir un valor");
            System.out.println("C. SALIR");

            opc = Leer.leerTexto("¿Qué quiere hacer? ").toUpperCase();

            if (opc.equals("A")){
                for (int numero : numeros) {
                    if (numero > 1) {
                        permiso = true;
                        break;
                    }
                }

                if (permiso){
                    System.out.println("Los valores són: " + Arrays.toString(numeros));
                }

            } else if (opc.equals("B")) {
                v = Leer.leerEntero("Introduce un valor: ");
                p = Leer.leerEntero("Introduce una posición: ");

                numeros[p] = v;

            } else {
                System.out.println("ERROR: Valor introducido no válido.");
            }

        }while (!opc.equals("C"));
    }

    /**
     * 9. Crea un programa que cree un array de enteros de tamaño 30 y lo rellene con valores enteros
     * aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará cuántas
     * veces aparece en total y en qué posiciones del array.
     */

    public static void vector9() {

    }

    /**
     * 10. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer
     * array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array
     * al segundo array en orden inverso, y mostrar ambos por pantalla.
     */

    public static void vector10() {

    }

    /**
     * 11. Crea un programa que permita al usuario almacenar una progresión aritmética en un array y
     * luego mostrarla. Una progresión aritmética es una serie de números que comienza por un valor
     * inicial VI, y continúa con incrementos de desplazamiento D. Por ejemplo, con VI=1 e D=2, la
     * progresión sería 1, 3, 5, 7, 9… El programa solicitará al usuario VI, D y el número de valores a
     * generar N.
     */

    public static void vector11() {

    }

    /**
     * 12. Crea un programa para mostrar el ranking de puntuaciones de un torneo de ajedrez con 8
     * jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los jugadores
     * (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las puntuaciones en
     * orden descendente(de la más alta a la más baja).
     */

    public static void vector12() {

    }
}
