package ordenardiscos;

import java.util.Arrays;

/**
 * Author: Nicolas Cardellini
 *
 */
public class OrdenarDiscos {

    static int count; //Variable que cuenta el numero de permutaciones del algoritmo

    public static char[] ordenarDiscos(char[] discos) {  //Funcion para ordenar arreglo de discos
        //Controlar que el primer disco sea rojo
        if (discos[0] != 'r') {
            char aux = discos[0];
            discos[0] = discos[1];
            discos[1] = aux;
            count++;
        }
        //Algoritmo de ordenacion de discos con fuerza bruta
        for (int i = 0; i < discos.length / 2; i++) {
            for (int j = 0; j < discos.length - 1; j++) {
                if (discos[j] != 'r' && discos[j + 1] != 'a') {
                    char aux = discos[j];
                    discos[j] = discos[j + 1];
                    discos[j + 1] = aux;
                    count++;
                }
            }
        }
        return discos;
    }

    public static void main(String[] args) {
        char[] discos = {'a', 'r', 'a', 'r', 'a', 'r', 'a', 'r'};
        System.out.println("Discos desordenados: " + Arrays.toString(discos));
        System.out.println("Discos ordenados: " + Arrays.toString(ordenarDiscos(discos)));
        System.out.println("Numero de permutaciones: " + count);

    }

}
