package com.generation;

//Se importa java.util.Scanner para usar Scanner
import java.util.Scanner;

public class Codigo4 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); // Se agrega System.in como parametro

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se cambia Turno del jugador 1, por Turno del jugador 2
    // Se elimina el objeto s2 de tipo Scanner, ya que no es utilizado
    String j2 = s.nextLine();

    if (j1.equals(j2)) // Al ser String se utiliza .equals para comparar en lugar de ==. Se quita un parentesis que da error 
    {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch (j1) {
        case "piedra":
          if (j2.equals("tijeras")) // Al ser String se utiliza .equals para comparar en lugar de ==
          {
            g = 1;
          }

        case "papel":
          if (j2.equals("piedra")) // Al ser String se utiliza .equals para comparar en lugar de ==  
          {
            g = 1;
          } // Se agrega llave de cierre para evitar el error
        case "tijeras": // Se cambia tijera por tijeras como lo indica la instrucción
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
      }
      System.out.println("Gana el jugador " + g);
    }

  }

}