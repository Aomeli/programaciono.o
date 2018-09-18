/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import java.util.Scanner;

/**
 *
 * @author T-101
 */
public class Areas {
    public static void main(String[] args) {
     
        
        Scanner scaner=new Scanner (System.in);
        int opcion=-1;
        do{
                System.out.println("1-Area de un cuadrado");
		System.out.println("2-Area de un rectangulo");
		System.out.println("3-Area de un trinagulo");
		System.out.println("Selecciona una opción");
                opcion=scaner.nextInt();
        switch(opcion){
            case 1:
         // cuadrado
        System.out.println("Dame el lado del cuadrado");
        float lado=scaner.nextFloat();
        
        System.out.println("\nEl area del cuadrado es " + (lado*lado));
	break;
        case 2:
	// area de un rectangulo
	   System.out.println("Dame la base del rectangulo");
     float base=scaner.nextFloat();
	  System.out.println("Dame la altura del rectangulo");
        float altura=scaner.nextFloat();
	System.out.println("\nEl area del rectangulo es " + (base*altura));
	break;
	case 3:
      	// area de un triangulo
	System.out.println("Dame la base del tiangulo");
        float base1=scaner.nextFloat();
	System.out.println("Dame la altura del tiangulo");
        float altura1=scaner.nextFloat();
	System.out.printf("\nEl area del triangulo es %1.2f\n", (base1*altura1)/2);
	break;
        }
    }
      while(opcion==1||opcion==2||opcion==3);
    }
}


