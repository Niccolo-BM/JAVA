package Ejercicio.Entity;

import Ejercicio.Model.iAgua;

public class Squirtle extends Pokemon implements iAgua {

   public Squirtle() {
   }

   @Override
   protected void atacarPlacaje() {
      System.out.println("Ataque de placaje de Squirtle");

   }

   @Override
   protected void atacarAraniazo() {
      System.out.println("Ataque de placaje de Squirtle");


   }

   @Override
   protected void atacarMordizco() {
      System.out.println("Ataque de placaje de Squirtle");


   }
/////////////////////////////////////////////////////
   @Override
   public void atacarHidroBomba() {

   }

   @Override
   public void atacarBurbuja() {

   }

   @Override
   public void atacarPistoAgua() {

   }
}
