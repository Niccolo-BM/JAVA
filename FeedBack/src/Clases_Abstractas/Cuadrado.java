package Clases_Abstractas;

import org.w3c.dom.ls.LSOutput;

public class Cuadrado implements Figura, Dibujable {
   private Double lado;

   public Cuadrado() {
   }
   public Cuadrado(Double lado) {
      this.lado = lado;
   }

   @Override
   public Double calcularArea() {
      Double resultado = lado * lado;
      return resultado;
   }


   @Override
   public void dibujar() {
      System.out.println("ALOOO Cuadrado");

   }

}
