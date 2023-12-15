package Ejercicio2;

import Ejercicio1.OperacionesVarias;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int opcion;
        int numerito;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una opcion\n[1] Saber si un numero es perfecto\n[2] Saber si un numero es primo\n[3] Comprobar si un numero es abundante\n[4] Construir pirámide");
        opcion = teclado.nextInt();
        OperacionesVarias operacionesvarias = new OperacionesVarias();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca un numero");
                numerito = teclado.nextInt();
                operacionesvarias.comprobarperfecto(numerito);

            case 2:
                System.out.println("Introduzca un numero");
                numerito = teclado.nextInt();
                operacionesvarias.comprobarprimo(numerito);

            case 3:
                System.out.println("Introduzca un numero");
                numerito = teclado.nextInt();
                operacionesvarias.comprobarabundante(numerito);

            case 4:
                System.out.println("Introduzca un numero");
                numerito = teclado.nextInt();
                operacionesvarias.piramide(numerito);

            case 5:
        }
    }
}
