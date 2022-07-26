import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conexion {
    public Connection get_connecction() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root","MinYoongi0903");
            if (conection != null) {
                System.out.println("Si conectó :D");
            }
        }catch(SQLException e){
            System.out.println("Error en conexión!! " + e);
        }
        return conection;
    }

}