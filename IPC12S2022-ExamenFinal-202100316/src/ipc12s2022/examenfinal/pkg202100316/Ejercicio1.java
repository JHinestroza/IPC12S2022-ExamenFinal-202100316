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
public class Ejercicio1 {

    public void Ejercicio1() {
        Scanner in = new Scanner (System.in);
        
        int primernumero = 0;
        int segundonumero = 0;
        System.out.println("*************************************");
        System.out.println("a selecciono el de numeros mayores");
        System.out.println("Ingrese el primer numero ");
        primernumero = in.nextInt();
        System.out.println("Ingrese el segundo numero ");
        segundonumero = in.nextInt();
        
        if (primernumero > segundonumero) {
            System.out.println("El primer numero es mayor " + primernumero);
        }
        if (segundonumero > primernumero) {
            System.out.println("El segundo numero es mayor  "+segundonumero);
        }
        if (primernumero == segundonumero) {
            System.out.println("Los numeros son iguales");
        }

    }
}
