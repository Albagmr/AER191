/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serrico_191;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM alba
 */
public class SerRico_191 {

    /**
     * @param args Acepta el reto 191
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcasos;
        numcasos = sc.nextInt();// mostramos por pantalla el numero de veces que queremos introducir datos.
        int compartimentosacuario;//declaramos la variable compartimentosacuario.
        int capacidadacuario;//declaramos la variable capacidadacuario.
        int litrosacuario;// declaramos la variable litros.
        int diferenciatanques;// declaramos la variable 
        /*
       A continuacion, empezamos hacer un bucle en el que se repetira dependiendo de los número de casos que le digamos nosotros.
       Por ejempo, si le decimos que nos lo repita 2 veces, el programa para cuando le insertamos el segundo caso.
         */
        for (int i = 0; i < numcasos; i++) {
            compartimentosacuario = sc.nextInt();//pedimos por pantalla el compatimento del acuario.
            capacidadacuario = sc.nextInt();// pedimos por pantalla la capacidad del acuario.
            diferenciatanques = sc.nextInt();// pedimos por pantalla tambien la diferencia tanques.
            litrosacuario = capacidadacuario;// ahora igualamos los litros del acuario a la capacidad del acuario.
            capacidadacuario -= diferenciatanques;// la capacidad del acuario es igual a la capacidad del acuario restando la diferencia del tanque

            /*
            Hacemos otro for en el cual se van restando los compartimentos que ya hemos ido calculando
             */
            for (int r = 0; r < compartimentosacuario - 1; r++) {
                litrosacuario += capacidadacuario;// aqui marcamos Los litros del acuario seria igual a los litros del acuario más la capacidad del acuario
                capacidadacuario -= diferenciatanques; //aqui marcamos la capacidad del acuario igual a la capacidad del acuario menos la diferencia del tanque.
            }
            System.out.println(litrosacuario); //finalmente, mostramos por pantalla los litros del acuario al que pertenece
        }
    }

}
