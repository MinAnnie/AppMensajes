import java.util.Scanner;

public class Menu {
    public Menu() {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("--- Bienvenido a la aplicación de mensajes en Java! ---");
            System.out.println("Escoge una opción.");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir.");
            /*--- leer la opción ---*/
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("--- Crear mensaje ---");
                    MensajesService.CrearMensaje();
                    break;
                case 2:
                    System.out.println("--- Listar mensaje ---");
                    MensajesService.ListarMensajes();
                    break;
                case 3:
                    System.out.println("--- Eliminar Mensaje ---");
                    MensajesService.BorrarMensaje();
                    break;
                case 4:
                    System.out.println("--- Editar mensaje ---");
                    MensajesService.EditarMensaje();
                    break;
                default:
                    System.out.println("Por favor selecciona una opción.");
            }
        }while(opcion != 5);
    }

}
