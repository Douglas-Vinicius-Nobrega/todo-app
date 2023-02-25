package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    // driver de conexão com o mySql
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    // URL  = caminho de conexão até o banco de dados
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    // usuario, por padrão vem como root 
    public static final String USER = "root";
    // senha, por padrão sem senha
    public static final String PASS = "";
    
    // metodo que vai nos devolver a conexão
    // precisamos importa o pacote Connection em java.sql.connection
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            // se houver erro, vai executar essa linha
            throw new RuntimeException("Erro na conexão com o banco" + ex.getMessage(), ex);
        }
    }
    
    // Metodo que vai fechar
    public static void closeConnection (Connection connection){
        try {
            // vai verificar se a conexão existe
            // se existir, fechar nossa conexão
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco");
        }
    }
    
     public static void closeConnection (Connection connection, PreparedStatement statement){
        try {
            // vai verificar se a conexão existe
            // se existir, fechar nossa conexão
            if(connection != null) {
                connection.close();
            }
            
            if(statement != null) {
                statement.close();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco" + ex.getMessage(), ex);
        }
    }
     
    public static void closeConnection (Connection connection, PreparedStatement statement, ResultSet resultSet){
        try {
            // vai verificar se a conexão existe
            // se existir, fechar nossa conexão
            if(connection != null) {
                connection.close();
            }
            
            if(statement != null) {
                statement.close();
            }
            
            if(resultSet != null) {
                resultSet.close();
            }
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco" + ex.getMessage(), ex);
        }
    }
    
    
}
