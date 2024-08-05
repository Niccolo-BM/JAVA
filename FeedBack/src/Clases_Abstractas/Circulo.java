package Clases_Abstractas;

public class Circulo implements Figura, Dibujable, Rotable {
   private Double radio;

   public Circulo() {
   }
   public Circulo(Double radio) {
      this.radio = radio;
   }

   @Override
   public Double calcularArea() {
      Double pi = 3.14;
      Double resultado = pi * radio *radio;
      return resultado;
   }

   @Override
   public void dibujar() {
      System.out.println("ALOOO Circulo");
   }

   @Override
   public void rotar() {
      System.out.println("ALOOO rote el circulo");

   }
}
