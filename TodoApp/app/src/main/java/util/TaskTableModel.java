
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

 
public class TaskTableModel extends AbstractTableModel{
    
    // vetor de string, colunas que vai aparecer na minha table
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    // lista de task, uma lista que vai guarda tarefa
    List<Task> tasks = new ArrayList<>();

    // métodos do AbstractTableModel, metódos que tenho que implementar, obrigatórios
    @Override
    public int getRowCount() { // quantas tarefas eu tenho
        // vai ser o numeros de tarefas
        return tasks.size();
    }

    @Override
    public int getColumnCount() { // quantas colunas eu tenho
        return columns.length;
    }
    
    @Override  // método que vai colocar os nomes de acordo com a ordem da coluna
    public String getColumnName(int columnIndex){ // retorna o nome da coluna
        return columns[columnIndex];
    }
    
    // método que vai deixar editapa nossa tarefa
    // vai verificar se a célular da nossa coluna é editavel
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // se o index da coluna for igual a 3
        // que é a coluna da tarefa concluída
        return columnIndex == 3;
    }
    
    @Override // esse método ja existe, vamos sobrescrevelo
    // retorna a classe do componente que está em determinado coluna
    // se é string, bool, int
    public Class<?> getColumnClass(int columnIndex){
        // verificando se a lista de tarefa é vazia
        if(tasks.isEmpty()) {
            return Object.class;
        }
        // vai chamar o método getValueAt
        // vai pegar a primeira linha, vai pegar o dado da coluna
        // e vai pegar a classe desse tipo de dado
        // e vai retorna esse tipo de dado ex: string, boolean
        return this.getValueAt(0, columnIndex).getClass();
        
        // isso vai permitir que a taberla tarefa, em vez de ficar true ou false
        // vai ficar do tipo check, clicavel
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // qual valor em determinado linha e coluna
        
        // coluna solicitada, 1, 2, 3, 4, 5 ou 6
        switch(columnIndex) {
            case 0:
                // na coluna 1, retorna o nome da tarefa da linha 1
                return tasks.get(rowIndex).getName();
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2: 
                // formatei a data
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4: 
                return "";
            case 5: 
                return "";
            
            default:
                return "Dados não encontrado";
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // nossa lista de tarefas
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
