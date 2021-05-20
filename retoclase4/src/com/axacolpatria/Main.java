package com.axacolpatria;
import java.util.Scanner;
public class Main {


    public static void Suma() {
        Scanner teclado = new Scanner(System.in);
        int numerouno,numerodos,resultado;
        System.out.println("Tu opción escogida es Suma");
        System.out.println("");
        System.out.println("Ingresa tu primer numero");
        numerouno=teclado.nextInt();
        System.out.println("Ingresa tu segundo numero");
        numerodos=teclado.nextInt();
        resultado=numerouno+numerodos;
        System.out.println("");
        System.out.printf("El resultado de tu suma es:" +resultado);
    }

    public static void Resta() {
        Scanner teclado = new Scanner(System.in);
        int numerouno,numerodos,resultado;
        System.out.println("Tu opción escogida es Resta");
        System.out.println("");
        System.out.println("Ingresa tu primer numero");
        numerouno=teclado.nextInt();
        System.out.println("Ingresa tu segundo numero");
        numerodos=teclado.nextInt();
        resultado=numerouno-numerodos;
        System.out.println("");
        System.out.printf("El resultado de tu resta es:" +resultado);
    }

    public static void Multiplicacion() {
        Scanner teclado = new Scanner(System.in);
        int numerouno,numerodos,resultado;
        System.out.println("Tu opción escogida es Multiplicación");
        System.out.println("");
        System.out.println("Ingresa tu primer numero");
        numerouno=teclado.nextInt();
        System.out.println("Ingresa tu segundo numero");
        numerodos=teclado.nextInt();
        resultado=numerouno*numerodos;
        System.out.println("");
        System.out.printf("El resultado de tu Multiplicación es:" +resultado);
    }

    public static void Division() {
        Scanner teclado = new Scanner(System.in);
        int numerouno,numerodos,resultado;
        System.out.println("Tu opción escogida es División");
        System.out.println("");
        System.out.println("Ingresa tu primer numero");
        numerouno=teclado.nextInt();
        System.out.println("Ingresa tu segundo numero");
        numerodos=teclado.nextInt();
        if (numerodos==0){
            System.out.println("No se puede dividir entre cero");
        }
        else{
            resultado=numerouno/numerodos;
            System.out.println("");
            System.out.printf("El resultado de tu División es:" +resultado);
        }

    }

    public static void Imprimirnumerosdel1al1000() {
        System.out.println("Tu opción escogida es imprimir numeros del 1 al 1000");
        System.out.println("");
        int contador=1;
        while(contador<=1000){
            System.out.println(contador);
            contador++;
        }
    }

    public static void Numeromayor() {
        Scanner teclado = new Scanner(System.in);
        int numerouno,numerodos,resultado;
        System.out.println("Tu opción escogida es mostrar el numero mayor");
        System.out.println("");
        System.out.println("Ingresa tu primer numero");
        numerouno=teclado.nextInt();
        System.out.println("Ingresa tu segundo numero");
        numerodos=teclado.nextInt();
        if (numerouno>numerodos){
            System.out.printf("Tu numero mayor es:" +numerouno);
        }
        else if (numerodos>numerouno){
            System.out.printf("Tu numero mayor es:" +numerodos);
        }

        else{
            System.out.printf("Tus numeros ingresados son iguales en cantidad");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Hola, Aqui podras realizar las siguientes operaciones");
        System.out.println("");
        System.out.println("Escoge la operación que desesas realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Division");
        System.out.println("5. Numeros del 1 al 1000");
        System.out.println("6. Encuentra el numero mayor");
        System.out.println("");
        opcion= teclado.nextInt();

        switch (opcion){

            case 1:
                Suma();
            break;

            case 2:
                Resta();
            break;

            case 3:
                Multiplicacion();
            break;

            case 4:
                Division();
            break;

            case 5:
                Imprimirnumerosdel1al1000();
            break;

            case 6:
                Numeromayor();
            break;

            default:
                System.out.println("Ha introducido una opción erronea");
        }

        }

    }

