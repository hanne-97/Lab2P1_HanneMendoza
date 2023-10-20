/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_hannemendoza;

import java.util.Scanner;

public class Lab2P1_HanneMendoza {

    public static void main(String[] args) {
        Scanner kore = new Scanner(System.in);
        int opcion;
        System.out.println("1. Dibujando triángulos");
        System.out.println("2. Área de figuras");
        System.out.println("3. Evaluando números");
        System.out.println("Ingrese el ejercicio: ");
        opcion = kore.nextInt();

        while (opcion > 0 && opcion < 4) {

            if (opcion == 1) {
                System.out.println("Ingrese el primer valor positivo: ");
                int num1 = kore.nextInt();
                System.out.println("Ingrese el segundo valor positivo: ");
                int num2 = kore.nextInt();
                System.out.println("Ingrese el tercer valor positivo: ");
                int num3 = kore.nextInt();

                if (num1 >= 0 && num2 >= 0 && num3 >= 0) {
                    if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2) {
                        System.out.println("Las longitudes ingresadas forman un triángulo.");
                    } else if (num1 + num2 < num3 && num2 + num3 > num1 && num3 + num1 > num2) {
                        System.out.println("Las longitudes ingresadas no forman un triángulo.");
                    }
                } else {
                    System.out.println("Las longitudes no pueden ser negativas");
                }

            } else if (opcion == 2) {
                System.out.println("Elegir la figura que desea calcular el área: ");
                System.out.println("1. Rectángulo");
                System.out.println("2. Triángulo");
                System.out.println("3. Círculo");
                int res = kore.nextInt();

                char continua = 's';
                while (continua == 's' || continua == 'S') {
                    if (res == 1) {
                        System.out.print("Ingrese la base: ");
                        double base = kore.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura = kore.nextDouble();
                        double rectangulo = base * altura;
                        System.out.println("El área del rectangulo es: " + rectangulo);
                    } else if (res == 2) {
                        System.out.print("Ingrese la base: ");
                        double base = kore.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura = kore.nextDouble();
                        double triangulo = 0.5 * base * altura;
                        System.out.print("El área del triángulo es: " + triangulo);
                    } else {
                        System.out.print("Ingrese el radio: ");
                        double radio = kore.nextDouble();
                        double circulo = Math.PI * radio * radio;
                        System.out.println("El área del círculo es: " + circulo);
                    }

                    System.out.println("Desea calcular el área de otra figura? [s/n]: ");
                    continua = kore.next().charAt(0);
                    System.out.println("Elegir la figura que desea calcular el área: ");
                    System.out.println("1. Rectángulo");
                    System.out.println("2. Triángulo");
                    System.out.println("3. Círculo");

                }

            } else if (opcion == 3) {
                System.out.print("Ingrese un número a evaluar: ");
                int num1 = kore.nextInt();
                boolean par = false;
                boolean primo = false;
                if (num1 % 2 == 0) {
                    par = true;
                }
                int cont = 1;
                int divisores = 0;
                while (cont <= num1) {
                    if (num1 % cont == 0) {
                        divisores++;
                    }
                    cont++;
                }
                if (divisores == 2) {
                    primo = true;
                }

                if (par == true && primo == true) {
                    System.out.println("El número ingresado es par y primo");
                } else if (par == true) {
                    System.out.println("El número ingresado es par");
                } else if (par == false && primo == true) {
                    System.out.println("El número ingresado es impar y primo");
                } else if (par == false) {
                    System.out.println("El número ingresado es impar");
                }

            }
            System.out.println("1. Dibujando triángulos");
            System.out.println("2. Área de figuras");
            System.out.println("3. Evaluando números");
            System.out.println("Ingrese el ejercicio: ");
            opcion = kore.nextInt();
        }

    }
}
