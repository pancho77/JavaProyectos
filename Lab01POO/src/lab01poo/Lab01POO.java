/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01poo;

import java.util.Scanner;
import static lab01poo.Lab01POO.calc_area;
import static lab01poo.Lab01POO.calc_circunferencia;

/**
 *
 * @author L3_Lab
 */
public class Lab01POO {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio;
        final double pi = 3.1416;
        
        System.out.println("Ingrese el radio del circulo");
        radio=entrada.nextDouble();
        
        calc_area(radio,pi);
        calc_circunferencia(radio,pi);
        
        Test prueba = new Test();
        
        prueba.testing();
        
        
    }
    
    public static void calc_area(double radio, double pi){
        double area;
        
        System.out.println("Calculando area..");
        
        area=pi*(radio*radio);
        
        System.out.println("El area del circulo es: "+area);
    }
    
    public static void calc_circunferencia(double radio, double pi){
        double circunferencia;
                
        circunferencia=2*pi*radio;
        
        System.out.println("La circunferencia es: "+circunferencia);
    }
    
    public static boolean verifica(int numero){
        switch(){
            case :
        }
    }
}

class Test{
    
    public void testing(){
        final double pi=3.1416;
        System.out.println("----TEST------");
        calc_circunferencia(-3,pi);
        calc_area(13,pi);
        
    }
}
