package Ejercicio.Entity;

import Ejercicio.Model.iTierra;

public class Bulbasaur extends Pokemon implements iTierra {

   public Bulbasaur() {
   }

   // LO EXTENDIDIDO DE POKEMON
   @Override
   protected void atacarPlacaje() {
      System.out.println("Ataque de placaje de bulbasaur");
   }

   @Override
   protected void atacarAraniazo() {
      System.out.println("Ataque araniazo de bulbasaur");


   }

   @Override
   protected void atacarMordizco() {
      System.out.println("Ataque de mordizco de bulbasaur");

   }


// LO IMPLEMENTADO DE iTIERRA
   @Override
   public void atacarDrenaje() {
      System.out.println("Ataque DRENAJE de bulbasaur");

   }

   @Override
   public void atacarParalizar() {
      System.out.println("Ataque PARALIZAR de bulbasaur");

   }
}
