
public class Main {
    public static void main(String[] args) {
        int respuesta;

        do {
            System.out.println("1- Vectores 1");
            System.out.println("2- Vectores 2");
            System.out.println("3- Vectores 3");
            System.out.println("4- Vectores 4");
            System.out.println("5- Vectores 5");
            System.out.println("6- Vectores 6");
            System.out.println("7- Vectores 7");
            System.out.println("8- Vectores 8");
            System.out.println("9- Vectores 9");
            System.out.println("10- Vectores 10");
            System.out.println("11- Vectores 11");
            System.out.println("12- Vectores 12");
            System.out.println("0- SALIR");

            respuesta = Leer.leerEntero("¿Qué quiere hacer? ");

            if (respuesta == 1){
                Vectores.vector1();
            } else if (respuesta == 2) {
                Vectores.vector2();
            } else if (respuesta == 3){
                Vectores.vector3();
            } else if (respuesta == 4) {
                Vectores.vector4();
            } else if (respuesta == 5){
                Vectores.vector5();
            } else if (respuesta == 6) {
                Vectores.vector6();
            } else if (respuesta == 7) {
            Vectores.vector7();
            } else if (respuesta == 8){
                Vectores.vector8();
            } else if (respuesta == 9) {
                Vectores.vector9();
            } else if (respuesta == 10) {
                Vectores.vector10();
            } else if (respuesta == 11){
                Vectores.vector11();
            } else if (respuesta == 12) {
                Vectores.vector12();
            }

        }while (respuesta != 0);



    }
}