package Exercicis;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
    
        Scanner teclat = new Scanner(System.in);
        
        
        int opcio;
        do {
            System.out.println("\nOpcions que pots triar");
            System.out.println("1. Euros a Lliura");
            System.out.println("2. Lliura a Euros.");

            System.out.print("Tria una de les opcions:  ");
            
            opcio = teclat.nextInt();
            
             switch (opcio) {
                case 1:
                    //EUROS A LLIURES
                    System.out.print("Introdueix en €: ");
                    double valor_euros = teclat.nextDouble();
                    
                    double tipus_de_canvi = 0.88d;
                    System.out.println(valor_euros + "€ acatualment equivalen a: " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
                    break;
                //LLIURES A EUROS
                case 2:
                    System.out.print("Introdueix en £: ");
                    double valor_lliures = teclat.nextDouble();
                    
                    double tipus_de_canvi1 = 1.15d;
                    System.out.println(valor_lliures + "€ acatualment equivalen a: " + (valor_lliures * tipus_de_canvi1) + " lliures esterlines (£)");
                    break;
            }
         
        } while (opcio != 2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
