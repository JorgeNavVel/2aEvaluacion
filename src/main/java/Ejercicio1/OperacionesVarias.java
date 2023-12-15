package Ejercicio1;

public class OperacionesVarias {
    public void comprobarperfecto(int num) {

        int sumadivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                sumadivisores = sumadivisores + i;
            }
        }
        if (sumadivisores == num) {
            System.out.println("El numero es perfecto.");
        }
    }
    public void comprobarprimo(int num) {

        boolean primo = false;
        for (int i = 2; i <= num/2 ; i++) {
            if (num%i == 0) {
                primo = true;
                break;
            }
        }
        if (!primo) {
            System.out.println("Es un numero primo");
        }
        else {
            System.out.println("No es un numero primo");
        }
    }

    public void comprobarabundante(int num) {

        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                suma = suma + i;
            }
        }
        if (suma > num) {
            System.out.println("Es un numero abundante");
        }
        else {
            System.out.println("No es un numero abundante");
        }
    }

    public void piramide(int num) {

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
