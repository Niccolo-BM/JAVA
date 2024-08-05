package Ejercicio.Entity;

import Ejercicio.Model.iElectrico;

public class Pikachu extends Pokemon implements iElectrico {

   public Pikachu() {
   }

   ///////////////////////////////////////
   @Override
   protected void atacarPlacaje() {
      System.out.println("Ataque de placaje de Pikachu");

   }

   @Override
   protected void atacarAraniazo() {
      System.out.println("Ataque de placaje de Pikachu");

   }

   @Override
   protected void atacarMordizco() {
      System.out.println("Ataque de placaje de Pikachu");

   }
///////////////////////////////////
   @Override
   public void atacarImpacTrueno() {

   }

   @Override
   public void atacarPunioTrueno() {

   }
}
