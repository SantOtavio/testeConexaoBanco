import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSelect {
    public static void main(String[] args) throws SQLException {
        int id = 2;
        String sql = "select * from contatos where id =" + id;

        Conexao conexao = new Conexao();
        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet != null && resultSet.next()) {
            System.out.println("entrou");
            Contato contato = new Contato(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("email"), resultSet.getString("telefone"), resultSet.getInt("idade"));
            System.out.println(contato);
        }

        connection.close();
    }
}
