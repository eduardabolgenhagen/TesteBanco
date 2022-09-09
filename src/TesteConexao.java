import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectaBD();
    }
}
