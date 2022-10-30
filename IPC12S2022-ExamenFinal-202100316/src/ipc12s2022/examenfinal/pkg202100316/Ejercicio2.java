/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc12s2022.examenfinal.pkg202100316;

import java.util.Scanner;

/**
 *
 * @author Hinestroza
 */
public class Ejercicio2 {

    Scanner in = new Scanner(System.in);

    public void Ejercicio2() {
        int numeroimmpar = 0;
        System.out.println("Ingrese un numero par para la elaboracion de la piramide");
        numeroimmpar = in.nextInt();
                
        int residuo = numeroimmpar % 2;
        if (residuo != 0) {
            for (int i = 1; i <= numeroimmpar; i++) {
                for (int j = 1; j <= numeroimmpar-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1  ; j <= (i*2)-1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Ha ingresado un numeor impar");
    }
}
}
