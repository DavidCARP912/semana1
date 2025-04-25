/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionsemana1.labprogramacionsemana1;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
    

;

/**
 *
 * @author sandr
 */
public class Ponce_David_VariablesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre =scanner.next();
        
        
        System.out.println("Cuantas horas trabaja en el mes");
        double hrtr = scanner.nextDouble();
        
        System.out.println("Ingrese su tarifa por hora");
        double hrtarifa = scanner.nextDouble();
        
        double semanal = (hrtr*hrtarifa)/4;
        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: "+nombre);
        System.out.println("Hora de Trabajo Mensual "+hrtr);
        System.out.println("Tarifa por Hora : Lps "+hrtarifa);
        System.out.println("Salario del Empleado Semanal: Lps. "+semanal);

        
        
    }
    
}
