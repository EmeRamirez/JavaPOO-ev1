import cuentas.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Bienvenido a Blubank");

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
    }
}