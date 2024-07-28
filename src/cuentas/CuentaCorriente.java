package cuentas;

public class CuentaCorriente {
    // Los atributos llevan el modificador de acceso private para seguir el principio de encapsulamiento
    private Integer nro_cuenta;
    private String titular;
    private Integer saldo;

    public CuentaCorriente(Integer nro_cuenta, String titular) {
        this.nro_cuenta = nro_cuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    public CuentaCorriente(Integer nro_cuenta, String titular, Integer saldo) {
        this.nro_cuenta = nro_cuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNroCuenta() {
        return nro_cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setNroCuenta(Integer nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String toString() {
           if (saldo <= 0)  {
               return "\nCuentaCorriente: " +
                       "\nNúmero de cuenta: " + nro_cuenta +
                       "\nTitular: " + titular +
                       "\nNo cuenta con saldo en su cuenta.";
           } else {
               return "\nCuentaCorriente: " +
                       "\nNúmero de cuenta: " + nro_cuenta +
                       "\nTitular: " + titular +
                       "\nSaldo $" + saldo ;
           }
    }

    public void abonarMonto(Integer cant) {
        System.out.println("\nABONO Recibido: $" + cant);
        if (cant > 0) {
            Integer nvoSaldo = saldo + cant;
            setSaldo(nvoSaldo);
            System.out.println("\nSu nuevo saldo es: $" + nvoSaldo);
        } else {
            System.out.println("\nDebe ingresar una cantidad válida.");
        }
    }

    public void girarMonto(Integer cant) {
        System.out.println("\nGIRO Recibido: $" + cant);
        if (cant <= 0) {
            System.out.println("El monto a girar debe ser positivo.");
            return;
        }
        if (saldo >= cant) {
            Integer nvoSaldo = saldo - cant;
            setSaldo(nvoSaldo);
            System.out.println("\nSe ha retirado: $" + cant +"\nSu nuevo saldo es: $" + nvoSaldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
