import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double resultado;
        int opcion;
        String continuar;
        Scanner sc = new Scanner(System.in);

        // Ciclo do-while para repetir el menú hasta que el usuario decida salir
        do {
            System.out.println("Bienvenido al sistema de calculadora");
            System.out.println("/**********************************/");
            System.out.println("Seleccione la operacion:");
            System.out.println("1. Suma ");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("/**********************************/");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma");
                    System.out.println("Ingrese el primer numero:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:
                    System.out.println("Resta");
                    System.out.println("Ingrese el primer numero:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    System.out.println("Multiplicacion");
                    System.out.println("Ingrese el primer numero:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;

                case 4:
                    System.out.println("Division");
                    System.out.println("Ingrese el primer numero:");
                    num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo numero:");
                    num2 = sc.nextDouble();

                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la division es: " + resultado);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

            if (opcion != 5) {
                System.out.println("¿Desea continuar? (s/n)");
                continuar = sc.next();
            } else {
                continuar = "n";
        }

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
    }
            }
