import java.sql.*;

public class MensajesDAO {
    /*--- métodos CRUD---*/
    public static void CrearMensajeDB(Mensajes mensaje){
        conexion db_conn = new conexion();

        try (Connection conexion = db_conn.get_connecction()) {
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, mensaje_autor) VALUES (?, ?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("--- Mensaje creado correctamente ---");
            }catch (SQLException e){
                System.out.println("Error ->" + e);
            }

        }catch (SQLException e){
            System.out.println();
        }
    }

    public static void LeerMensajesDB(){
        conexion db_conn = new conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection conexion = db_conn.get_connecction()){
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("mensaje_autor"));
                System.out.println("Fecha del mensaje: " + rs.getDate("mensaje_fecha"));
            }

        }catch (SQLException e){
            System.out.println("Error -> " + e);
        }
    }

    public static void BorrarMensajeDB(int id_mensaje){
        conexion db_conn = new conexion();
        PreparedStatement ps = null;

        try (Connection conexion = db_conn.get_connecction()){
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                if (ps.getUpdateCount() != 0){
                    System.out.println("Ha sido eliminada con éxito! :D");
                }else {
                    System.out.println("No se pudo eliminar porque no existe o no pusiste bien el Id :c");
                }

        }catch (SQLException e){
            System.out.println("Error -> " + e);
        }
    }

    public static void ActualizarMensajeDB(Mensajes mensaje){
        conexion db_conn = new conexion();
        PreparedStatement ps = null;

        try (Connection conexion = db_conn.get_connecction()){
            String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, Mensajes.getMensaje());
            ps.setInt(2, Mensajes.getIdMensaje());
            if (ps.executeUpdate() != 0){
                System.out.println("Mensaje actualizado con éxito uwu");
            }
        }catch (SQLException e){
            System.out.println("No se pudo actualizar :c");
            System.out.println("Error -> " + e);
        }
    }
}
