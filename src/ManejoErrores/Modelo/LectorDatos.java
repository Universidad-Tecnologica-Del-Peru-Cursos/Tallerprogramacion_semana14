package ManejoErrores.Modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

// Model
public class LectorDatos {
    private Scanner scanner;

    public LectorDatos() {
        scanner = new Scanner(System.in);
    }

    public int leerEntero(String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.nextLine(); // Limpiar el búfer del teclado
            }
        } while (!entradaValida);

        return numero;
    }

    public double leerDouble(String mensaje) {
        double numero = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el búfer del teclado
            }
        } while (!entradaValida);

        return numero;
    }

    public char leerChar(String mensaje) {
        char caracter = ' ';
        boolean entradaValida = false;

        do {
            try {
                System.out.print(mensaje);
                caracter = scanner.next().charAt(0);
                entradaValida = true;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un carácter.");
                scanner.nextLine(); // Limpiar el búfer del teclado
            }
        } while (!entradaValida);

        return caracter;
    }

    public String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    public void cerrar() {
        scanner.close();
    }
}
