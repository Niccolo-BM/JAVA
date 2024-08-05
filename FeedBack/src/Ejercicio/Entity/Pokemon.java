package Ejercicio.Entity;

public abstract class Pokemon {
   protected int numPokedex;
   protected String nomnbre;
   protected Double peso;
   protected String sexo;
   protected int temporada;

   protected abstract void atacarPlacaje();

   protected abstract void atacarAraniazo();

   protected abstract void atacarMordizco();

   public Pokemon() {
   }



}
