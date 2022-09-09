import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/agenda";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Connection conectaBD() throws SQLException{
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e){
            throw new RuntimeException("Falha na conexão: "+ e);
        }
    }
}
