/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc12s2022.examenfinal.pkg202100316;
import java.util.Scanner;
/**
 *
 * @author Hinestroza
 */
public class IPC12S2022ExamenFinal202100316 {
static Ejercicio1 ejercicicio1 = new Ejercicio1();
static Ejercicio2 ejercicicio2 = new Ejercicio2();
static Ejercicio3 ejercicicio3 = new Ejercicio3();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int eleccion = 0;
        System.out.println("***************************************************");
        System.out.println("           MENU PRICNIPAL           ");
        System.out.println("Digite el numero segun el ejercicio a realizar");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("1. Ejercicio 3");
        System.out.println("***************************************************");
        System.out.print("=========>");
        eleccion = in.nextInt();
        
        switch (eleccion){
            case 1:
                ejercicicio1.Ejercicio1();
                break;
            case 2:
                ejercicicio2.Ejercicio2();
                break;
            case 3:
                ejercicicio3.Ejercicio3();
                break;
                
        }
        
    }
}
