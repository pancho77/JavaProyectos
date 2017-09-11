/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02poo;

import java.text.DecimalFormat;
import static lab02poo.Test6.secSum;

/**
 *
 * @author panxo
 */
public class Lab02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test0=3*4+5*6+7*-2;
        double test1=1.5*2.0+(5.5/2)+5/4;
        int test2=23 % 5 + 31 / 4 % 3 - 17 % (16 % 10);
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9) );//test3
        double test4= 345 / 10 / 3 * 55 / 5 / 6 + 10 / (5 / 2.0);
        boolean test5= 1 / 2 > 0 || 4 == 9 % 5 || 1 + 1 < 1 - 1;
        System.out.println("Resultado= "+test5);
        
        //---------------------------------------------------------------------
        String x = "java";
        String y = "tomas";
        String z = "tv";
        String rugby = "hamburgesa";
        String java = "donna";
        hamburgesa(x, y, z);//hamburger
        hamburgesa(z, x, y);
        hamburgesa("rugby", z, java);
        hamburgesa(y, rugby, "x");
        hamburgesa(y, y, "java");
     
        Test6 test;
        test = new Test6();
        
        Test6.secSum(0.0);
        Test6.secSum(1.0);
        Test6.secSum(1.5);
        Test6.secSum(2.0);
        Test6.secSum(2.7);
    }
   
    public static void hamburgesa(String y, String z, String x) {
        System.out.println(z + " y " + x + " gusta " + y);
    }
}

class Test6{
    
     public static void secSum(double sec){
        DecimalFormat decimales = new DecimalFormat("0.000");
        final double a=1.0;
        double i=1.0;
        double resultado;
        double suma=1.0;
        
        if(sec!=0){
             while(suma<sec){
            i++;
            resultado=a/i;
            suma+=resultado;
            }
        }
        else{
            suma=0.0;
        }
      
   
        double numero = suma;
        System.out.println("Suma "+decimales.format(numero));
        
    }
}
