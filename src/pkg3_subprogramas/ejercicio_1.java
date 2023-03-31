/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_subprogramas;

import java.util.Scanner;

/**
 *
 * @author xrod2
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        int num1,num2,op;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do{
            op = menu();
        
            switch (op){
                case 1:
                    System.out.println("La suma es: "+suma(num1,num2));
                    break;
                case 2:
                    System.out.println("la resta es: "+resta(num1,num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion es: "+multi(num1,num2));
                    break;
                case 4:
                    System.out.println("la divicion es: "+divi(num1,num2));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        }while(op!=5); 
        
    }
    
    public static int menu(){
        int op;
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("---------------------");
        System.out.println("Seleccione una");
        op = leer.nextInt();
        return op;
    }
    
    public static int suma(int a, int b) {
        return (a+b);
    }
    
    public static int resta(int a, int b) {
        return (a-b);
    }
    
    public static int multi(int a, int b) {
        return (a*b);
    }
    
    public static float divi(int a, int b) {
        if(b!=0){
            return (a/b);    
        }else{
            System.out.println("no se puede dividir");
            return 0;
        }  
    }
}
