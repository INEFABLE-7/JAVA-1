/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        System.out.println("#########OPERACIONES MATEMATICAS#######");
        System.out.println("calculamos la suma y la resta de los numero que ingrese: ");
                
        
       Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1=sc.nextInt();
        System.out.println("INGRSE EL SEGUNDO NUMERO");
        int num2 = sc.nextInt();
        int suma=(num1+num2);
        int resta=(num1+num2);
        System.out.println("el resultado de la suma de:"+num1+"mas"+num2+"es de:"+suma);
        
        
        
        
}
}