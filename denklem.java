/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.denklem;

/**
 *
 * @author Tarık BALCI
 */
import java.util.Scanner;
 
 
public class denklem {
  
    public static void main(String[] args) {
        
        Scanner sc; 
        sc = new Scanner(System.in);
        System.out.println("(ax²+bx+c) ikinci dereceden denkleminin sabit sayılarını giriniz. "); 
        System.out.print("a sayısını giriniz:"); 
        double a = sc.nextInt(); 
        System.out.print("b sayısını giriniz:"); 
        double b = sc.nextInt(); 
        System.out.print("c sayısını giriniz:"); 
        double c = sc.nextInt(); 
        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin kökü yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("Çakışık iki kökü var x1= x2= " + x); 
        }
 
    
}
    }

