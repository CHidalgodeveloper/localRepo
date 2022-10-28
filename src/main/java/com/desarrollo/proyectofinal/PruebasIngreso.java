package com.desarrollo.proyectofinal;

import java.util.Scanner;

/**
 *
 * @author stinky
 */
public class PruebasIngreso {

    public static void main(String[] args) {
        char opP, opE, opPR;
        int numP = 1;
        String nombre[] = new String[100];
        String apellido[] = new String[100];
        int edad[] = new int[100];
        String cedula[] = new String[100];
        String resultado[] = new String[100];
        String cedula2;
        double calificacion[] = new double[100];
        double acumC = 0;
        int contC = 0;
        double calificacionM = 0;
        int contCM=0;
        double promedio;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--INGRESO ITSQMET--");
            System.out.println("");
            System.out.println("PRUEBAS DE INGRESO");
            System.out.println("");
            System.out.println("MENU PRINCIPAL");
            System.out.println("");
            System.out.println("1.- ESTUDIANTE");
            System.out.println("2.- PROFESOR");
            System.out.println("3.- SALIR");
            System.out.println("");
            System.out.println("Escoja una opción");
            opP = sc.next().charAt(0);
            if (opP == '1') {
                do {
                    System.out.println("");
                    System.out.println("--MENU ESTUDIANTES--");
                    System.out.println("");
                    System.out.println("1.- SOLICITAR PRUEBA");
                    System.out.println("2.- VERIFICAR CALIFICACIONES");
                    System.out.println("3.- SALIR");
                    System.out.println("");
                    System.out.println("Escoja una opción.");
                    opE = sc.next().charAt(0);
                    if (opE == '1') {
                        System.out.println("Ingrese su nombre: ");
                        nombre[numP - 1] = sc.next();
                        System.out.println("Ingrese su apellido: ");
                        apellido[numP - 1] = sc.next();
                        System.out.println("ingrese su edad: ");
                        edad[numP - 1] = sc.nextInt();
                        if (edad[numP - 1] >= 17 && edad[numP - 1] < 60) {
                            do {
                                System.out.println("Ingrese su cédula: ");
                                cedula[numP - 1] = sc.next();

                                if (cedula[numP - 1].length() != 10) {
                                    System.out.println("datos invalidos.");
                                    System.out.println("intente de nuevo.");
                                }
                            } while (cedula[numP - 1].length() != 10);
                            if (cedula[numP - 1].charAt(9) == '0' || cedula[numP - 1].charAt(9) == '1') {
                                System.out.println("Puede rendir su prueba el día lunes.");
                                resultado[numP - 1] = "pendiente";
                                numP = numP + 1;

                            } else if (cedula[numP - 1].charAt(9) == '2' || cedula[numP - 1].charAt(9) == '3') {
                                System.out.println("Puede rendir su prueba el día martes.");
                                resultado[numP - 1] = "pendiente";
                                numP = numP + 1;

                            } else if (cedula[numP - 1].charAt(9) == '4' || cedula[numP - 1].charAt(9) == '5') {
                                System.out.println("Puede rendir su prueba el día miércoles.");
                                resultado[numP - 1] = "pendiente";
                                numP = numP + 1;

                            } else if (cedula[numP - 1].charAt(9) == '6' || cedula[numP - 1].charAt(9) == '7') {
                                System.out.println("Puede rendir su prueba el día jueves.");
                                resultado[numP - 1] = "pendiente";
                                numP = numP + 1;

                            } else if (cedula[numP - 1].charAt(9) == '8' || cedula[numP - 1].charAt(9) == '9') {
                                System.out.println("Puede rendir su prueba el día viernes.");
                                resultado[numP - 1] = "pendiente";
                                numP = numP + 1;

                            } else {
                                System.out.println("cédula invalida.");
                                opE = '1';
                            }

                        } else {
                            System.out.println("Edad no cumple con los requisitos.");
                            opE = '3';
                            opP = '3';
                        }

                    } else if (opE == '2') {
                        System.out.println("ingrese su número de cédula:");
                        cedula2 = sc.next();

                        for (int i = 0; i < numP; i++) {
                            if (cedula2.equals(cedula[i])) {
                                System.out.println("NOMBRE" + "\t" + "EDAD" + "\t" + "CÉDULA" + "\t" + "CALIFICACIÓN" + "\t" + "RESULTADO");
                                System.out.println(nombre[i] + "\t" + edad[i] + "\t" + cedula[i] + "\t" + calificacion[i] + "\t" + resultado[i]);
                            }

                        }

                    } else if (opE != '3') {
                        opE = '1';
                        System.out.println("Opción invalida.");
                        System.out.println("Intente de nuevo.");

                    }
                } while (opE == '1' || opE == '2');

            } else if (opP == '2') {
                do {
                    System.out.println("");
                    System.out.println("--MENU PROFESORES--");
                    System.out.println("");
                    System.out.println("1.- INGRESO DE INFORMACIÓN DEL ESTUDIANTE");
                    System.out.println("2.- PROMEDIO FINAL");
                    System.out.println("3.- SALIR");
                    System.out.println("");
                    System.out.println("Escoja una opción.");
                    opPR = sc.next().charAt(0);
                    if (opPR == '1') {
                        System.out.println("ingrese número de cédula del estudiante:");
                        cedula2 = sc.next();

                        for (int i = 0; i < numP; i++) {
                            if (cedula2.equals(cedula[i])) {
                                System.out.println("NOMBRE" + "\t" + "EDAD" + "\t" + "CÉDULA" + "\t" + "CALIFICACIÓN" + "\t" + "RESULTADO");
                                System.out.println(nombre[i] + "\t" + edad[i] + "\t" + cedula[i] + "\t" + calificacion[i] + "\t" + resultado[i]);
                                do {
                                    System.out.println("ingrese la calificación del estudiante: ");

                                    calificacion[i] = sc.nextDouble();
                                    if (calificacion[i] < 0 || calificacion[i] > 20) {
                                        System.out.println("calificación no valida.");
                                        System.out.println("intente de nuevo.");
                                    }

                                } while (calificacion[i] < 0 || calificacion[i] > 20);
                                acumC = acumC + calificacion[i];
                                contC = contC + 1;
                                
                                
                                if (calificacion[i] > calificacionM) {
                                    calificacionM = calificacion[i];

                                }
                                if (calificacion[i] > 15) {
                                    resultado[i] = "USTED APROBO";
                                } else {
                                    resultado[i] = "USTED REPROBO";

                                }

                            }

                        }
                    } else if (opPR == '2') {
                        System.out.println("NOMBRE" + "\t" + "EDAD" + "\t" + "CÉDULA" + "\t" + "CALIFICACIÓN" + "\t" + "RESULTADO");
                        for (int i = 0; i < numP; i++) {
                            if(i!=numP){
                            System.out.println(nombre[i] + "\t" + edad[i] + "\t" + cedula[i] + "\t" + calificacion[i] + "\t" + resultado[i]);
                            }

                        }
                        
                        System.out.println("promedio final estudiantes: " + acumC / contC);
                        for (int i = 0; i < contC; i++) {
                            if(calificacion[i]>(acumC/contC)){
                                contCM=contCM+1;
                            }
                            
                        }
                        System.out.println("la calificación mayor es: " + calificacionM);

                    } else if (opPR != '3') {
                        opPR = '1';
                        System.out.println("Opción invalida.");
                        System.out.println("Intente de nuevo.");
                    }
                } while (opPR == '1' || opPR == '2');

            } else if (opP != '3') {
                opP = '1';
                System.out.println("Opción invalida.");
                System.out.println("Intente de nuevo.");

            }

        } while (opP == '1' || opP == '2');
    }
}
