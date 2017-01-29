/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.t01.p3;
import java.util.Scanner;
//Jessica Delgado González A1411536 IMT
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Distancia entre dos puntos");
        // Variables. Jessica Delgado González A1411536 IMT
    Double x1, x2,y1, y2,D;
    //Indicador de que usaremos teclado. Jessica Delgado González A01411536 IMT
    Scanner teclado=new Scanner (System.in);
    //Asignar valores a las variables. Jessica Delgado González A01411536 IMT
        System.out.println("Introduce x1");
        x1=teclado.nextDouble();
        System.out.println("Introduce y1");
        y1=teclado.nextDouble();
        System.out.println("Introduce x2");
        x2=teclado.nextDouble();
        System.out.println("Introduce y2");
        y2=teclado.nextDouble();
        //Resolvemos el problema. Jessica Delgado González A01411536 IMT
        D=Math.sqrt(Math.pow((x1-x2),2)+Math.pow(y1-y2,2));
        //Mostrar el resultado. Jessica Delgado González A01411536 IMT
        System.out.println("La distancia es "+D);
    
    }
    
}
