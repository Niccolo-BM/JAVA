import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taller 4.2");

        Scanner scanner = new Scanner(System.in);
        /*
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        */

        // Ejercicio 1: Menú interactivo.

        /* System.out.println("Ejercicio 1: Menú interactivo.");
        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Bienvenido a la Calculadora Basica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un numero: ");
                    float num1 = scanner.nextFloat();
                    System.out.print("Ingrese otro numero: ");
                    float num2 = scanner.nextFloat();
                    double resultadoSuma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 2:
                    System.out.print("Ingrese un numero: ");
                    float num3 = scanner.nextFloat();
                    System.out.print("Ingrese el segundo numero: ");
                    float num4 = scanner.nextFloat();
                    float resultadoResta = num3 - num4;
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 3:
                    System.out.print("Ingrese un numero: ");
                    float num5 = scanner.nextFloat();
                    System.out.print("Ingrese otro numero: ");
                    float num6 = scanner.nextFloat();
                    float resultadoMulti = num5 * num6;
                    System.out.println("El resultado de la multiplicacion es: " + resultadoMulti);
                    break;
                case 4:
                    System.out.print("Ingrese un numero: ");
                    float dividendo = scanner.nextFloat();
                    System.out.print("Ingrese otro numero que no sea cero: ");
                    float divisor = scanner.nextFloat();

                        if (divisor != 0) {
                            float resultadoDivi = dividendo / divisor;
                            System.out.println("El resultado de la división es: " + resultadoDivi);
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                    break;
                }
        } while (opcion != 5); */



        // Ejercicio 2: Facturación de una tienda..

       /* System.out.println("Ejercicio 2: Facturación de una tienda..");

        String[] productos = {"Harina de trigo", "Levadura", "Mantequilla", "huevos", "Sal"};
        double[] precios = {2250, 3500, 2500, 700, 3400};

        int[] cantidades = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad  en unidades de " + productos[i] + " que desea llevar: ");
            cantidades[i] = scanner.nextInt();
        }

        double totalFactura = 0;
        for (int i = 0; i < productos.length; i++) {
            totalFactura += cantidades[i] * precios[i];
        }

        System.out.println("Total a pagar: $" + totalFactura); */



        // Ejercicio 3: Notas de un curso.

        /* System.out.println("Ejercicio 3: Notas de un curso.");
        double[] calificaciones = {100, 88, 55, 65};

        int totalNotas = 8;
        int notaMinima_apobar = 76;

        double sumaCalificaciones = 0;
        for ( double nota : calificaciones) {
            sumaCalificaciones += nota;
        }

        double promedioActual = (double) sumaCalificaciones / totalNotas;
            System.out.println( "el promedio actual sobre 8 notas es de: "+promedioActual);

        double promedioNecesario = notaMinima_apobar- promedioActual;


        if (promedioNecesario <= 0) {
            System.out.println("Bueno al parecer aprobo .");
        } else {
            double  notasRestantes = promedioNecesario / 4;
            System.out.println("como promedio en las notas restantes, deberias sacar: "+notasRestantes+ " en cada una de ellas");

            System.out.println("para aprobar el curso, necesitas un promedio minimo de: " + promedioNecesario);
        } */



        // Ejercicio 4: Calculadora de descuentos.
            // ejecutar junto a ejercicio

       /* System.out.println("Ejercicio 4: Calculadora de descuentos.");

        double[] descuentoPorPorcentaje = {0.25, 0.20, 0.15, 0.10};
        double[] rangoDescuentos = {10000, 5000, 3000, 2000};

        double descuento = 0;
        double porcentajeAplicado = 0;

        for (int i = 0; i < rangoDescuentos.length; i++) {
            if (totalFactura >= rangoDescuentos[i]) {
                porcentajeAplicado = descuentoPorPorcentaje[i];
                descuento = totalFactura * porcentajeAplicado;
                break;
            }
        }

        double totalConDescuento = totalFactura - descuento;

        System.out.println("Porcentaje descontado: " + (porcentajeAplicado * 100) + "%,"+ " para un descuento por valor de: $" + descuento);
        System.out.println("Total a pagar con descuento: $" + totalConDescuento); */



        // Ejercicio 5: Busca palabras.

       /* System.out.println("Ejercicio 5: Busca palabras. ");

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        System.out.println("Ingrese la palabra que desea buscar:");
        String buscadorPalabra = scanner.nextLine();

        String[] palabras = texto.split(" ");

        int[] posiciones = new int[palabras.length];
        int contador = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(buscadorPalabra)) {
                posiciones[contador] = i;
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("La palabra '" + buscadorPalabra + "' no se encontró en el texto.");
        } else {
            System.out.print("La palabra '" + buscadorPalabra + "' se encontró en las posiciones: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(posiciones[i] + " ");
            }
            System.out.println();
        } */



        // Ejercicio 6: Búsqueda por coincidencia en arrays

       /* System.out.println("Ejercicio 6: Búsqueda por coincidencia en arrays.");

        String [] nombres = {"Nicolas","catalina", "Juan", "Tomas","Manchas", "Zoe"};
        System.out.println(Arrays.toString(nombres));

        System.out.print("Que nombre desea buscar: ");
        String buscarNombre = scanner.nextLine();
        int posicionEncontrada = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscarNombre)) {
                posicionEncontrada = i;
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.println("El nombre '" + buscarNombre + "' se encontró en la posición " + posicionEncontrada + " del array.");
        } else {
            System.out.println("El nombre '" + buscarNombre + "' no se encontró en el array.");
        } */



        // Ejercicio 7: Transposición de una Matriz

       System.out.println("Ejercicio 7: Transposición de una Matriz. ");




        // Ejercicio 9: Contar coincidencias en un Array:

        System.out.println("Ejercicio 9: Contar coincidencias en un Array:. ");




        // Ejercicio 10: Invertir un Array:

       /* System.out.println("Ejercicio 10: Invertir un Array. ");

        int[] array = {-2,-1,0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Array invertido:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } */

        scanner.close();
    }
}