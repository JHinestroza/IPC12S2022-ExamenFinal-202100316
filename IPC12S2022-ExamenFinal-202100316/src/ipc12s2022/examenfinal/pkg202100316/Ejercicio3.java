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
public class Ejercicio3 {
    static Scanner in = new Scanner (System.in);
    int numerovacas= 0;
    
    public void Ejercicio3() {
        
        
        int pesomaximo = 0;
        
        System.out.println("Ingresa el numero de vacas");
        numerovacas = in.nextInt();
        System.out.println("Ingreso el peso máximo");
        pesomaximo = in.nextInt();
        int arreglo[][] = new int [numerovacas][3];
        
        System.out.print("Ingrese los pesos seguidos de comas : ");
        Vectores(numerovacas,1,arreglo);
        System.out.print("Ingrese la produccion de leche :");
        Vectores(numerovacas,2,arreglo);
        
        int acum = 0;
        int contador = 0;
        int acum2 = 0;
        
        for (int i = 0; i < numerovacas; i++) {
            acum += arreglo[i][1];
            contador ++;
            if (acum > pesomaximo) {
                acum = acum -arreglo[i][1];
                System.out.println(acum); 
                break;
            }
        }
        for (int i = 0; i < contador; i++) {
            acum2 += arreglo[i][2];
        }
        System.out.println("La produccion es de "+acum2);
    }
    public void Vectores(int tamaño, int columna, int[][] arreglo) {
        
        String numero = in.next();//Ingresa el vector
        String[] fragamentos = numero.split(","); //1,2,2 ejemplicando el ingreso
        //System.out.println(fragamentos.length);
        
        if (fragamentos.length == tamaño) { //comparando para evitar colapso del programa
            for (int i = 0; i < tamaño; i++) {
                arreglo[i][columna] = Integer.parseInt(fragamentos[i]); // String a Integer
           }
        } else {
            System.out.println("Los tamaños del vector y del vector no concuerda"); 
           this.Ejercicio3();
        }
    }
}
