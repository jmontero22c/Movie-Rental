package test;
import beans.Peliculas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author jesus
 */
public class OperacionesBD {
    public static void main(String[] args) {
        
    }
    
    public static void actualizarPelicula(int id, String genero){
        DBConnection con = new DBConnection();
        String sql = "UPDATE pelicula SET genero = ? WHERE id = ?";
        
        try{
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch(Exception ex){
            
        } finally{
            con.desconectar();
        }
    }
}
