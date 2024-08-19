package movimientos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimientos {

    private Integer monto;

    private String tipo;

    private Date fecha;

    public Movimientos(Integer monto, String tipo, Date fecha) {
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formattedDate.format(fecha);
        return
                "-----------------------"+'\n'+
                "monto = " + monto +'\n'+
                "tipo de movimiento = " + tipo + '\n' +
                "fecha = " + fechaFormateada;
    }


}
