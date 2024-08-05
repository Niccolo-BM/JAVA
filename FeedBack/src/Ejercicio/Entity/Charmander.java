package Ejercicio.Entity;

import Ejercicio.Model.iFuego;

public class Charmander extends Pokemon implements iFuego {

   public Charmander() {
   }

   @Override
   protected void atacarPlacaje() {
      System.out.println("Ataque de placaje de Charmander");

   }

   @Override
   protected void atacarAraniazo() {
      System.out.println("Ataque de placaje de Charmander");

   }

   @Override
   protected void atacarMordizco() {
      System.out.println("Ataque de placaje de Charmander");

   }
/////////////////////////////////
   @Override
   public void atacarPunioFuego() {

   }

   @Override
   public void atacarLanzaLlamas() {

   }

   @Override
   public void atacarAscuas() {

   }
}
