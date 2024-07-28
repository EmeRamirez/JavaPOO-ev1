import cuentas.CuentaCorriente;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bienvenido a Blubank");
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("¿Desea ingresar un saldo inicial? (si/no)");
        String respuesta = scanner.nextLine().toLowerCase();

        int numeroCuenta = 10000000 + random.nextInt(90000000);
        CuentaCorriente cuenta;

        if ("si".equals(respuesta)) {
            System.out.println("Ingrese su saldo inicial:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            int saldoInicial = scanner.nextInt();
            scanner.nextLine();
            cuenta = new CuentaCorriente(numeroCuenta, nombre, saldoInicial);
        } else {
            cuenta = new CuentaCorriente(numeroCuenta, nombre);
        }

        System.out.println("Cuenta creada exitosamente con número de cuenta: " + cuenta.getNroCuenta());
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Abonar dinero");
            System.out.println("2. Girar dinero");
            System.out.println("3. Salir");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad a abonar:");
                    int montoAbonar = scanner.nextInt();
                    scanner.nextLine();
                    cuenta.abonarMonto(montoAbonar);
                }
                case 2 -> {
                    System.out.println("Ingrese la cantidad a girar:");
                    int montoGirar = scanner.nextInt();
                    scanner.nextLine();
                    cuenta.girarMonto(montoGirar);
                }
                case 3 -> System.out.println("Gracias " + cuenta.getTitular() + " por usar Blubank ¡Hasta pronto!");
                default -> System.out.println("Opción no válida, por favor ingrese 1, 2 o 3.");
            }
        } while (opcion != 3);

        scanner.close();
    }
    }

        /*
        // Se instancia una cuenta utilizando el constructor 1
        CuentaCorriente cuenta1 = new CuentaCorriente(1234, "Tamara Queando");

        // Se instancia una cuenta utilizando el constructor 2
        CuentaCorriente cuenta2 = new CuentaCorriente(4321, "Keka Galindo", 250000);

        System.out.print(cuenta1);
        System.out.print(cuenta2);

        // Se setean los saldos en ambas instancias
        cuenta2.setSaldo(550000);

        // En cuenta1 se establece saldo por defecto de $0
        System.out.println("\nSaldo actual: $" + cuenta1.getSaldo());

        cuenta1.girarMonto(2000); //Debería devolver "Saldo insuficiente"
        cuenta1.abonarMonto(10000); // Se abonan $10000
        cuenta1.girarMonto(2000); // Su nuevo saldo es $8000

        System.out.print(cuenta1);
        System.out.print(cuenta2);

        // Se abona un monto a la cuenta2
        cuenta2.abonarMonto(50000);

        // Se gira un monto a la cuenta 2
        cuenta2.girarMonto(300000);
    }*/
