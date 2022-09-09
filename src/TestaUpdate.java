import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaUpdate {
    public static void main(String[] args) throws SQLException {
        Contato contato = new Contato(3, "Leon", "leozin@gmail.com", "123456789-1234", 18);

        String sql = "UPDATE contatos SET " +
                "nome = '" + contato.getNome() + "', " +
                "email = '" + contato.getEmail() + "', " +
                "telefone = '" + contato.getTelefone() + "', " +
                "idade = " + contato.getIdade() +
                " WHERE id = " + contato.getId();

        Conexao conexao = new Conexao();
        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        statement.execute(sql);

        connection.close();
    }
}
