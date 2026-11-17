import java.util.Scanner;

public class PlantillaBateria {
    /*
     * Plantilla de Java con menú y auxiliares para completar
     * con la batería de ejercicios que corresponda
     */

    /*
     * MAIN y AUXILIARES
     */

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            int ejercicioSeleccionado = pintaMenu();
            salir = ejecutarEjercicio(ejercicioSeleccionado);
        } // fin while
        teclado.close();
    }

    public static int pintaMenu() {
        System.out.println("BATERIA DE EJERCICIOS (a completar) ");
        int numEjercicios = 20; // Cambiar por los que corresponda
        System.out.println("SELECCIONA CUAL QUIERES EJECUTAR (1-" + numEjercicios + ". PULSA 0 SI QUIERES SALIR");
        System.out.println("\t 1- Ejercicio 1");
        System.out.println("\t 2- Ejercicio 2");
        // A Completar -> también se puede poner una breve descripción del ejercicio
        System.out.println("\t ... continuará con extras");
        int ejercicioSeleccionado = auxLeerEntero(0, numEjercicios);
        return ejercicioSeleccionado;
    }

    public static boolean ejecutarEjercicio(int ejercicioSeleccionado) {
        boolean salir = false;
        switch (ejercicioSeleccionado) {
            case 0:
                salir = true;
                System.out.println("SALIENDO DE LA BATERIA DE EJERCICOS DE ... "); // A completar
                System.out.println("HASTA LA PRÓXIMA");
                break;
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            // A completar
            default:
                System.out.println("TODAVIA NO IMPLEMENTADO. DISCULPE LAS MOLESTIAS");
                break;
        } // fin switch
        return salir;
    }

    // auxiliar para leer un entero incluyendo nextLine para que no haya problemas
    // bucle para impedir que escriban algo que no es un entero
    public static int auxLeerEntero() {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) { // nos aseguramos de que es entero
                aux = teclado.nextInt();
                teclado.nextLine(); // para evitar problemas de leer un entero y luego un string
                correcto = true;
            } else {
                teclado.nextLine();
                System.out.println("NO HAS ESCRITO UN NUMERO ENTERO");
            }
        }
        return aux;
    }

    // auxiliar para leer un entero incluyendo nextLine para que no haya problemas
    // bucle para impedir que escriban algo que no es un entero y que esté dentro de
    // un rango
    public static int auxLeerEntero(int minimo, int maximo) {
        boolean correcto = false;
        int aux = 0;
        while (!correcto) {
            if (teclado.hasNextInt()) { // nos aseguramos de que es entero
                aux = teclado.nextInt();
                teclado.nextLine();
                if (aux < minimo || aux > maximo) { // Comprobamos que está dentro del rango
                    System.out.println("EL NUMERO NO ESTA DENTRO DEL RANGO " + minimo + "-" + maximo);
                } else {
                    correcto = true;
                }
            } else {
                teclado.nextLine();
                System.out.println("NO HAS ESCRITO UN NUMERO ENTERO");
            }
        }
        return aux;
    }

    // auxiliar para leer un double incluyendo nextLine para que no haya problemas
    // bucle para impedir que escriban algo que no es un double
    public static double auxLeerDouble() {
        boolean correcto = false;
        double aux = 0;
        while (!correcto) {
            if (teclado.hasNextDouble()) { // nos aseguramos de que es entero
                aux = teclado.nextDouble();
                teclado.nextLine();
                correcto = true;
            } else {
                teclado.nextLine();
                System.out.println("NO HAS ESCRITO UN NUMERO DOUBLE");
            }
        }
        return aux;
    }

    // auxiliar para leer un double incluyendo nextLine para que no haya problemas
    // bucle para impedir que escriban algo que no es un double o que no esté dentro
    // del rango
    public static double auxLeerDouble(double minimo, double maximo) {
        boolean correcto = false;
        double aux = 0;
        while (!correcto) {
            if (teclado.hasNextDouble()) { // nos aseguramos de que es entero
                aux = teclado.nextDouble();
                teclado.nextLine();
                if (aux < minimo || aux > maximo) {
                    System.out.println("EL NUMERO NO ESTA DENTRO DEL RANGO " + minimo + "-" + maximo);
                } else {
                    correcto = true;
                }
            } else {
                teclado.nextLine();
                System.out.println("NO HAS ESCRITO UN NUMERO DOUBLE");
            }
        }
        return aux;
    }

    /*
     * Fin de auxiliares. Aquí van los ejercicios
     */

    public static void ejercicio1() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio2() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio3() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio4() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio5() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio6() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio7() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio8() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio9() {
        System.out.println("SIN IMPLEMENTAR");
    }

    public static void ejercicio10() {
        System.out.println("SIN IMPLEMENTAR");
    }

    // COMPLETAR SI HAY MÁS EJERCICIOS EN LA BATERIA. HAY QUE CREAR EL METODO,
    // INCLUIRLO EN EL MENÚ Y EN EL SWITCH DEL MÉTODO ELEGIR EJERCICIO

}
