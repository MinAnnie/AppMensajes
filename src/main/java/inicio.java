import java.sql.Connection;
public class inicio {
    public static void main(String[] args) {
        conexion conexion = new conexion();
        try(Connection cnx = conexion.get_connecction()){

        }catch (Exception e){
            System.out.println("no se puede conectar :c");
        }
    }
}
