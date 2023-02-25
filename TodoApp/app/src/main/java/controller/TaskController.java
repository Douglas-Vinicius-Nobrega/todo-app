
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;


public class TaskController {
    
    public void save(Task task) {
       
        String sql = "INSERT INTO tasks("
                + "idProject, "
                + "name, "
                + "description, "
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) values (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
    
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getCreatedAt().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tarefa "
            + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    // metodo de atualizar
    public void update(Task task) {
        
        String sql = "UPDATE tasks SET "
                + "idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "completed = ?, "
                + "deadline = ?, "
                + "createdAt = ?, "
                + "updatedAt = ? "
                + "WHERE id = ? ";
        
        Connection connection = null;
        PreparedStatement statement = null ;
        
        try {
            connection = ConnectionFactory.getConnection();
            
            statement = connection.prepareStatement(sql);
            
            // setando os valores do statement
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar " + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    
    }
    
    // metodo de remover
    public void removeById(int taskId) throws SQLException  {
       
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        
        Connection connection = null;
        PreparedStatement statement = null;
 
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);
        } finally { 
            ConnectionFactory.closeConnection(connection, statement);
            
        }
    }
    
    // Metodo que vai devolver uma lista de tarefas
    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        // Variavel que guarda o retorno que temos do bd
        ResultSet resultSet = null;
        // lista de tarefas que sera devolvida quando a chamada do método
        // acontecer
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            // criando conexão com o db
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            // setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
            statement.execute();
            
            // vai devolver o valor de resposta desse select
            resultSet = statement.executeQuery();
            
            // Vai percorrer os valores do meu reseultSet
            while(resultSet.next()) {
                // criando uma nova tarefa  
                Task task = new Task();
                // populando o banco de dados
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                // adicionaod as tarefas na lista
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar a(s) tarefa" + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        // Lista de tarefas que foi criada e caregada do bd
        return tasks;
    }
}
