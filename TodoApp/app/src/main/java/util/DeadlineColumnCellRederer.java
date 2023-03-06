package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

// renderizados padrão do java, para células


// vamos usar o método dessa classe extendida, para renderizar nossa aplicação
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer{
    @Override
    // vai devolver um componente, o componente é o que vai ser mostrado na célula
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
       
        JLabel label; // label que vai exibida no nosso grid
        // damos um super, pois estamos chamando um componente da classe pai
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // centralizando a data
        label.setHorizontalAlignment(CENTER);
        
        // pegando a tarefa que corresponde aquela linha
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        // 
        Task task = taskModel.getTasks().get(row);
        
        // verificando se o deadline, a data está depois de HOJE
        if(task.getDeadline().after(new Date())) {
         // se o prazo do deadline, foi maior que a data de hoje
         // vai ficar com a cor verde
         label.setBackground(Color.GREEN);
        } else {
        // se data for menor que data de hoje
        label.setBackground(Color.red);
        }
        return label;
    }
}
