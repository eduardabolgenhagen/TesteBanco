package Stament;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteDelete {
    public static void main(String[] args) throws SQLException {
        Integer id = 3;
        String sql = "delete from contatos where id = " + id;
        Conexao conexao = new Conexao();
        Connection connection = conexao.conectaBD();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        connection.close();
    }
}
