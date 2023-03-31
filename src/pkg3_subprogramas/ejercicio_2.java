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
public class ejercicio_2 {
    public static void main(String[] args) {
        String resp;
        boolean salida = false;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println(datos());
            System.out.println("Desa continuar trabajando?");
            resp=leer.next();
            resp=resp.toLowerCase();
            if (resp.equals("no") || resp.equals("n")){
                salida=true;
            }
        }while(!salida);

    }
    
    public static String datos(){
        String datos, nombre;
        int edad;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        nombre = leer.next();

        System.out.println("Ingrese su Edad");
        edad = leer.nextInt();

        if (edad > 18){
            datos = "el nombre es: "+nombre+", su edad es de: "+edad+" y se considera mayor de edad";
        }else{
            datos = "el nombre es: "+nombre+", su edad es de: "+edad+" y se considera menor de edad";
        }
        return datos;
    }
}
