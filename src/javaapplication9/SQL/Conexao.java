package javaapplication9.SQL;
import java.sql.*;

public class Conexao {
    static Connection connection = null;
    private static final String user = "root";
    private static final String password = "password";
    private static final String database = "projetoproo";
    private static final String url = "jdbc:mysql://localhost:3306/"+database;
    
    public Conexao() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, "root", "password");
            System.out.println("Conexao realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }
    }

    public static Connection getConexao() {
        return connection;
    }
}