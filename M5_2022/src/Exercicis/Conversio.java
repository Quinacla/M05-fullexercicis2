package Exercicis;

import java.util.Scanner;

public class Conversio {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix en €: ");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 1.15d;
        System.out.println(valor_euros + "€ acatualment equivalen a: " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
    } 
}
