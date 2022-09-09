import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsert {
    public static void main(String[] args) throws SQLException {

        Contato contato = new Contato("Leonardo", "leozinho@gmail.com", "123456789-1231", 18);

        String sql = "insert into contatos(nome, email, telefone, idade) " +
                "values ('" + contato.getNome() + "','" + contato.getEmail() + "','" + contato.getTelefone() + "','" + contato.getIdade() + "')";

        String sql2 = "select * from contatos";

        Conexao conexao = new Conexao();
        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();

        connection.close();
    }
}
