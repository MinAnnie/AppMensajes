import java.util.Scanner;

public class MensajesService {
    /*--- métodos para el menú ---*/
    public static void CrearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el mensaje:");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu nombre:");
        String autor = sc.nextLine();

        Mensajes registro = new Mensajes();

        registro.setMensaje(mensaje);
        registro.setAutorMensaje(autor);

        MensajesDAO.CrearMensajeDB(registro);

    }

    public static void ListarMensajes(){
        MensajesDAO.LeerMensajesDB();
    }

    public static void BorrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("ID del mensaje que quieres borrar: ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.BorrarMensajeDB(id_mensaje);

    }

    public static void EditarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------");
        Mensajes actualizacion = new Mensajes();

        System.out.println("Actualiza el mensaje: ");
        String mensaje = sc.nextLine();
        actualizacion.setMensaje(mensaje);
        System.out.println("ID del mensaje que quieres actualizar: ");
        int id_mensaje = sc.nextInt();

        actualizacion.setIdMensaje(id_mensaje);
        MensajesDAO.ActualizarMensajeDB(actualizacion);
    }
}
