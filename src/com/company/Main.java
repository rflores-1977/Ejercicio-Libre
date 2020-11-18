package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        /* EL USUARIO PEDIRA EL NOMBRE Y PUNTOS DE TRES EQUIPOS Y EL SISTEMA IMPRIMIRA EL EQUIPO GANADOR
        O SI ESTAN EMPATADOS Y REPETIRA EL PROCESO*/

        String equipo[] = new String[3];
        int puntos[] = new int[3];

        int b = 1;
        while (b > 0) {
            for (int c = 0; c < 3; c++) {
                System.out.println(" Ingrese el nobre del Equipo");
                equipo[c] = rd.nextLine();
                System.out.println(" Ingrese los Puntos");
                puntos[c] = rd.nextInt();
                rd.nextLine();

            }
            if (puntos[0] > puntos[1] && puntos[0] > puntos[2]) {
                System.out.println("El ganador es " + equipo[0]+" con "+puntos[0]+" puntos ");
            } else if (puntos[1] > puntos[0] && puntos[1] > puntos[2]) {
                System.out.println("El ganador es " + equipo[1]+" con "+puntos[1]+" puntos ");

            } else if (puntos[2] > puntos[0] && puntos[2] > puntos[1]) {
                System.out.println("El ganador es " + equipo[2]+" con "+puntos[2]+" puntos ");
            }else{
                System.out.println("Hay un empate entre los tres Equipos");
            }

        }
    }
}
