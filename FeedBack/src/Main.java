import Clases_Abstractas.Circulo;
import Clases_Abstractas.ClasAbtractas;
import Clases_Abstractas.Cuadrado;
import Clases_Abstractas.Figura;
import Encapsulamiento.Encapsulamiento;
import Herencia.Herencia;
import Polimorfismo.Vehiculo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Practica!");

        //tipo de datos primitivos
        boolean bolean = true;
        byte enteroPequeño = -1;
        int entero = -12;
        long enteroGrande = 122222;
        float flotante = 12.12f;
        double flotanteGrande = 12.4000000;
        char caracter = 'a';

       /* //Otros tipos de datos
        String cadenaDeTexto = "";
        int[] listaDeNumero = {2,4,6}; // lista de pares

        String[] vocales = {"a","e","i","o","u"};

        //Matrices [][]                   0:{ 0   ,   1}   1:{  0 }        2:{0}
        String[][] AnimalesConVocales = {{"aguila","abeja"},{"elefante"},{"iguana"}};

        System.out.println(AnimalesConVocales[0][0]);
        System.out.println(AnimalesConVocales[0][1]);
        // System.out.println(AnimalesConVocales[0][2]);// POR FUERA
        System.out.println(AnimalesConVocales[1][0]);

        String[][][] especie = {{{"ave"}},{{"mamifero"}},{{"reptil"}}};


        // Primera dimension -> Categoria
        // Segunda dimension -> SubCategoria
        // Tercera dimension -> Lista de Productos
        Scanner scanner = new Scanner(System.in);

        String[][][] inventario = new String[2][2][5];

        String[] categoria = {"Comida", "Aseo"};
        String[][] subCategoria = {{"Frutas","Vegetales"},{"Baño", "Cocina"}};

        System.out.println(inventario.length);
        System.out.println(inventario[0].length);
        System.out.println(inventario[0][0].length);

        for (int i = 0; i < 2; i++) {
            System.out.println("\n"+categoria[i]+": ");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < inventario[i][j].length ; k++) {
                    System.out.println("Ingrese un producto de la subcategoria "+ subCategoria[i][j]);
                    inventario[i][j][k] = scanner.nextLine();

                    System.out.println("Quiere agregar otro producto a la lista");
                    if (scanner.nextLine().equals("no")) {
                        break;
                    }
                }
            }
        }

        scanner.close();

        System.out.println("\nINVENTARIO TOTAL");

        for (int i = 0; i < 2; i++) {
            System.out.println((i+1)+". "+categoria[i]+": ");
            for (int j = 0; j < 2; j++) {
                String subCategoriaString = subCategoria[i][j]+": ";
                for (int k = 0; k < inventario[i][j].length ; k++) {
                    if (inventario[i][j][k] != null) {
                        subCategoriaString += inventario[i][j][k]+" ";
                    }
                }
                System.out.println(subCategoriaString);
            }
        } */


    //////////////////////////////////////////////////////////

    /*    Encapsulamiento.Alumno alum1 = new Encapsulamiento.Alumno();
        Encapsulamiento.Alumno alum2 = new Encapsulamiento.Alumno(2,"Nicolas","Bernal");


        System.out.println("Id del alumno 2 es: "+ alum2.getId());
        System.out.println("Nombre y apellido del alumno 2 son: "+ alum2.getNombre() +" "+ alum2.getApellido());

        alum1.setNombre("Catalina");
        alum1.setApellido("Cardenas");

        System.out.println("--------------------");
        System.out.println("Id del alumno 1 es: "+ alum1.getId());
        System.out.println("Nombre y apellido del alumno 1 son: "+ alum1.getNombre() +" "+ alum1.getApellido());

        //VALOR CAMBIADO CON "SET"
        System.out.println("--------------------");
        alum2.setNombre("Tomas");0
        System.out.println("Id del alumno 2 es: "+ alum2.getId());
        System.out.println("Nombre y apellido del alumno 2 son: "+ alum2.getNombre() +" "+ alum2.getApellido());
*/

    ////////////////////////////////////////////////////////////////////////////////
        Herencia herencia = new Herencia();
        herencia.mainHerencia();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.mainVehiculo();


        // acion para mostrar o ejecutar demas archivos dedsde el main        Encapsulamiento encapsulamiento = new Encapsulamiento();

        Encapsulamiento encapsulamiento = new Encapsulamiento();
        encapsulamiento.mainEncapsulamiento();

    //////////////////////////////////////////////////////////////////////////////////

        Cuadrado figura1 = new Cuadrado();
        //figura1.calcularArea();
        figura1.dibujar();

        Circulo figura2 = new Circulo();
        //figura2.calcularArea();
        figura2.dibujar();
        figura2.rotar();




    }
}
