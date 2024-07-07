import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Taller # 1");

    Scanner scanner = new Scanner(System.in);

  // Ejercicio 1: Calculadora Básica

    /* System.out.println("Ejercicio 1:");
    System.out.println("ingrese un numero:");
    int num1 = scanner.nextInt();
    System.out.println("ingrese otro numero:");
    int num2 = scanner.nextInt();

    int suma = num1 + num2;
    int resta = num2 - num1;
    int multi = num1 * num2;
    int divi = num2 / num1;

    System.out.println("La suma es = " + suma);
    System.out.println("La resta es = " + resta);
    System.out.println("La multiplicacion es = " + multi);
    System.out.println("La divicion es = " + divi);*/



  //  Ejercicio 2: Verificador de Edad

    /* System.out.println("Ejercicio 2:");
    System.out.println("Ingrese su edad:");
    int edad = scanner.nextInt();

    if (edad <= 17){
      System.out.println("Es menor de edad");
    } else if( edad >= 18 && edad < 90){
      System.out.println("Es mayor de edad y probablemente sigue vivo");
    } else if( edad > 91 && edad < 125){
      System.out.println("Es probable que este morido");
    }*/



  // Ejercicio 3: Conversor de Unidades

    /* System.out.println("Ejercicio 3:");
    System.out.println("Ingrese una distancia en Kilometros (Km):");
    float Km = scanner.nextfloat();

    float Millas = Km * 1.60934f ;

    System.out.println("Esos kilometros en Millas son = " + Millas);*/



  // Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)

    /* System.out.println("Ejercicio 4:");
    System.out.println("Ingrese su peso en Kilogramos (Kg):");
    float Kg = scanner.nextFloat();
    System.out.println("Ingrese su estatura en Metros (m):");
    float Altura = scanner.nextFloat();


    float Imc = Kg / (Altura * Altura);

    System.out.println("Su indice de Masa corporal (IMC) =" + Imc);*/



  // Ejercicio 5: Clasificador de Números

    /* System.out.println("Ejercicio 5:");
    System.out.print("Ingrese un numero: ");
    int numero = scanner.nextInt();

    if (numero > 0) {
      System.out.println("El número es positivo");
    } else if (numero < 0) {
      System.out.println("El número es negativo");
    } else {
      System.out.println("El número es cero");
    }

    if (numero == 0) {
      System.out.println("El número es cero.");
    } else if ( numero % 2 == 0){
      System.out.println("El número es par");
    } else {
      System.out.println("El numero es impar");
    }*/



  // Ejercicio 6: Calculadora de Días del Mes

    /* System.out.println("Ejercicio 6:");
    System.out.print("Ingrese el numero del mes para saber si tiene 31, 30 o 28 dias: ");
    int numMes = scanner.nextInt();
    int dias = 0;

    switch (numMes) {
      case  1: case 3: case 5: case 7: case 8: case 10: case 12:
        dias = 31;
        break;
      case 4: case 6: case 9: case 11:
        dias = 30;
        break;
      case 2:
        dias = 28;
        break;
    }
    System.out.println("El mes " + numMes + " tiene " + dias + " dias");*/



  // Ejercicio 7: Menú Interactivo

    /*System.out.println("Ejercicio 7:");
    System.out.print("Ingrese un numero: ");
    float num1 = scanner.nextFloat();
    System.out.print("Ingrese otro numero: ");
    float num2 = scanner.nextFloat();


    System.out.println("Escoja la operación a realizar: " +
                        " 1. Suma " +
                        " 2. Resta " +
                        " 3. Multiplicación " +
                        " 4. División;  " +
                        " e ingrese el número de la operación: ");
    int opcion = scanner.nextInt();


    float resultado = 0;
    switch (opcion) {
      case 1:
        resultado = num1 + num2;
        break;
      case 2:
        resultado = num1 - num2;
        break;
      case 3:
        resultado = num1 * num2;
        break;
      case 4:
        if (num2 != 0) {
          resultado = num1 / num2;
        } else {
          System.out.println("Obvio no va querer divir por 0");
          return;
        }
        break;
      default:
        System.out.println("Opción inválida.");
        return;
    }

    System.out.println("El resultado es: " + resultado);*/



  // Ejercicio 8: Cálculo de Promedio

    /* System.out.println("Ejercicio 8:");
    System.out.print("Ingrese nota # 1: ");
    float nota1 = scanner.nextFloat();
    System.out.print("Ingrese nota # 2: ");
    float nota2 = scanner.nextFloat();
    System.out.print("Ingrese nota # 3: ");
    float nota3 = scanner.nextFloat();

    float sumaNotas = nota1 + nota2 + nota3 ;
    float resultado = sumaNotas / 3;


    if (resultado >= 6){
      System.out.print("El promedio es = " + resultado + " SI aprueba ");
    } else {
      System.out.print("Estudie bruto, estudie");
    } */



  // Ejercicio 9: Calculadora de Año Bisiesto

    /* System.out.println("Ejercicio 9:");
    System.out.print("Ingrese un año: ");
    int year = scanner.nextInt();

    boolean esBisiesto = false;


    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {
        esBisiesto = true;
      }
    }

    if (esBisiesto) {
      System.out.println(year + " si es año bisiesto");
    } else {
      System.out.println(year + " no es año bisiesto.");
    }*/


    
  // Ejercicio 10: Calculadora de Propina

    /* System.out.println("Ejercicio 10:");
    System.out.print("Ingrese el valor total a pagar: ");
    double totalCuenta = scanner.nextDouble();


    System.out.print("Ingrese el porcentaje(%) de propina que desea dejar: ");
    double porcenPropina = scanner.nextDouble();


    double propina = (porcenPropina / 100.0) * totalCuenta;
    System.out.println("Propina a dejar: $" + propina);

    double totalAPagar = propina + totalCuenta;
    System.out.println("valor total a pagar incluyendo propina es de: "+ totalAPagar); */



  // Ejercicio 11: Ordenando Tres Números

    /* System.out.println("Ejercicio 11:");
    System.out.println("ingrese un numero entero:");
    int num1 = scanner.nextInt();
    System.out.println("ingrese otro numero entero:");
    int num2 = scanner.nextInt();
    System.out.println("ingrese Oootro numero entero:");
    int num3 = scanner.nextInt();

    if(num1 > num2 && num2 > num3 ){
      System.out.println(num3 + " es menor que " + num2 + " que es menor que "+ num1 );
    } else if (num1 > num3 && num3 > num2){
      System.out.println(num2 + " es menor que " + num3 + " que es menor que "+ num1 );
    } else if (num2 > num3 && num3 > num1){
      System.out.println(num1 + " es menor que " + num3 + " que es menor que "+ num2 );
    }else if (num2 > num1 && num1 > num3){
      System.out.println(num3 + " es menor que " + num1 + " que es menor que "+ num2 );
    }else if (num3 > num2 && num2 > num1){
      System.out.println(num1 + " es menor que " + num2 + " que es menor que "+ num3 );
    }else if (num3 > num1 && num1 > num2){
      System.out.println(num2 + " es menor que " + num1 + " que es menor que "+ num3 );
    } */



  // Ejercicio 12: Generador de Horóscopo

    /* System.out.println("Ejercicio 12:");
    System.out.print("ingrese el # de su mes de nacimiento: ");
    int mes = scanner.nextInt();
    System.out.print("ingrese su dia de nacimiento : ");
    int dia = scanner.nextInt();

    String signo = "";

    switch (mes){

      case 1:
        if ( dia >= 1 &&  dia <= 19 ){
            signo = "Capricornio";
        } else if ( dia >=20 && dia <=31 ){
          signo = "Acuario";
        }
        break;
      case 2:
        if ( dia >= 1 &&  dia <= 18 ){
          signo = "Acuario";
        } else if ( dia >=19 && dia <=28 ){
          signo = "Picis";
        }
        break;
      case 3:
        if ( dia >= 1 &&  dia <= 20 ){
          signo = "Pisis";
        } else if ( dia >=21 && dia <=31 ){
          signo = "Aries";
        }
        break;
      case 4:
        if ( dia >= 1 &&  dia <= 19 ){
          signo = "Aries";
        } else if ( dia >=20 && dia <=30 ){
          signo = "Tauro";
        }
        break;
      case 5:
        if ( dia >= 1 &&  dia <= 20 ){
          signo = "Tauro";
        } else if ( dia >=21 && dia <=31 ){
          signo = "Geminis";
        }
        break;
      case 6:
        if ( dia >= 1 &&  dia <= 20 ){
          signo = "Geminis";
        } else if ( dia >=21 && dia <=30 ){
          signo = "Cancer";
        }
        break;
      case 7:
        if ( dia >= 1 &&  dia <= 22 ){
          signo = "Cancer";
        } else if ( dia >=23 && dia <=31 ){
          signo = "Leo";
        }
        break;
      case 8:
        if ( dia >= 1 &&  dia <= 22 ){
          signo = "Leo";
        } else if ( dia >=23 && dia <=31 ){
          signo = "Virgo";
        }
        break;
      case 9:
        if ( dia >= 1 &&  dia <= 22 ){
          signo = "Virgo";
        } else if ( dia >=23 && dia <=30 ){
          signo = "Libra";
        }
        break;
      case 10:
        if ( dia >= 1 &&  dia <= 22 ){
          signo = "Libra";
        } else if ( dia >=23 && dia <=31 ){
          signo = "Escorpio";
        }
        break;
      case 11:
        if ( dia >= 1 &&  dia <= 21 ){
          signo = "Escorpio";
        } else if ( dia >=22 && dia <=30 ){
          signo = "Sagitario";
        }
        break;
      case 12:
        if ( dia >= 1 &&  dia <= 21 ){
          signo = "Sagitario";
        } else if ( dia >=22 && dia <=31 ){
          signo = "Capricornio";
        }
        break;
    }
    System.out.println("Tu signo del Zobaco es: "+signo); */



  // Ejercicio 13: Calculadora de Tarifa de Taxi

    /* System.out.println("Ejercicio 13:");
    System.out.print("Ingrese la distanicia en Kilometro(Km) " +
                     "recorrida en el taxi: ");
    int distancia = scanner.nextInt();

    int tarifaBase = 3000;
    int tarifaPorKm = 2100;

     int costoViaje = tarifaBase + (tarifaPorKm * distancia);

    System.out.print("El costo total del viaje es: $" + costoViaje);*/



  // Ejercicio 14: Convertidor de Temperatura

    /* System.out.println("Ejercicio 14:");
    System.out.println("Escoja el tipo de temperatura a obtener:");
    System.out.println("1. Convertir de Fahrenheit a Celsius");
    System.out.println("2. Convertir de Celsius a Fahrenheit ");
    System.out.print("Ingrese su opción : ");
    int opcion = scanner.nextInt();

    switch (opcion){
      case 1:
        System.out.print("Ingrese los °fahrenheit que desea convertir "+
                "a °Celcius: ");
        float fahrenheit = scanner.nextFloat();
        float celcius = (fahrenheit - 32) * 5/9;
        System.out.println("Esos °F a °Celcius son: " + celcius + "°C");
        break;
      case 2:
        System.out.print("Ingrese los °Celcius que desea convertir "+
                "a °Fahrenheit: ");
        celcius = scanner.nextInt();
        fahrenheit = celcius * 9/5 + 32;
        System.out.println("Esos °F a °Celcius son: " + fahrenheit+ "°F");
        break;
    }*/



  // Ejercicio 15: Sistema de Calificaciones

    /* System.out.println("Ejercicio 15 =>");
    System.out.print("Ingrese su nota obtenida en el examne: ");
    float nota = scanner.nextFloat();

     //string notaFinal = "";
     if( nota >= 90 && nota == 100){
       System.out.print("Obtuvo una A");
     } else if (nota <= 89 && nota >=80){
       System.out.print("Obtuvo una B");
     } else if (nota <= 79 && nota >=70) {
       System.out.print("Obtuvo una C");
     } else if (nota <= 69 && nota >=60) {
       System.out.print("Obtuvo una D");
     } else if (nota <= 59) {
       System.out.print("Obtuvo una F");
     } */

    scanner.close();
  }
}