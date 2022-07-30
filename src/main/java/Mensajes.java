import java.util.Date;

public class Mensajes {
/*--- métodos  ---*/
    private static int idMensaje;
    private static String mensaje;
    private String autorMensaje;
    private Date fechaMensaje;

    public Mensajes(){

    }

    public Mensajes(String mensaje, String autorMensaje, Date fechaMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    /*--- Getters y Setters ---*/
    public static int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public static String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public Date getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(Date fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
