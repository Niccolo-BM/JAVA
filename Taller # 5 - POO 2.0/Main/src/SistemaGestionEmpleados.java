package Main.src;

import Main.src.Inventario;
import Main.src.Producto;
import Main.src.ProductoEspecifico;

import java.awt.*;
import java.util.Scanner;

// Ejercicio 2: Sistema de Registro de Empleados

public class SistemaGestionEmpleados {
    public static void main(String[] args) {

        GestionEmpleados gestionEmpleados = new GestionEmpleados();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Elija una opcioon:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Eliminar empleados");
            System.out.print("Opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione tipo de contrato: 1. Temporal, 2. Permanente");
                    int tipoEmpleado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    System.out.println("Asigne ID al empleado nuevo: ");
                    int idEmpleado = scanner.nextInt();
                    System.out.println("Que salario devengara?: ");
                    double salario = scanner.nextDouble();

                    if (tipoEmpleado == 1) {
                        System.out.println("Por cunatos meses sera el contrato: ");
                        int duracionContrato = scanner.nextInt();

                        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre, edad, idEmpleado, salario, duracionContrato);
                        gestionEmpleados.agregarEmpleado(empleadoTemporal);

                    } else if (tipoEmpleado == 2) {
                        scanner.nextLine();

                        System.out.println("Asignar Departamento: ");
                        String departamento = scanner.nextLine();
                        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(nombre, edad, idEmpleado, salario, departamento);
                        gestionEmpleados.agregarEmpleado(empleadoPermanente);
                    } else {
                        System.out.println("Tipo de empleado no valido.");
                    }
                    break;
                case 2:
                    gestionEmpleados.verEmpleados();
                    break;
                case 3:
                    System.out.println("Ingrese el ID del empleado a eliminar:");
                    int idEliminar = scanner.nextInt();
                    gestionEmpleados.quitarEmpleado(idEliminar);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}

