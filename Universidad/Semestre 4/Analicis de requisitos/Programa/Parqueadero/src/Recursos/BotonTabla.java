
package Recursos;


import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class BotonTabla extends DefaultTableCellRenderer{
    
    @Override
    
    public Component getTableCellRendererComponent(JTable table, Object Objeto_renderizable, boolean isSelected, boolean hasFocus, int row, int column) {
        
        
        
        if (Objeto_renderizable instanceof JLabel) {
            JLabel lbl = (JLabel)Objeto_renderizable;
            return lbl;
        }
 
        
        return super.getTableCellRendererComponent(table, Objeto_renderizable, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
