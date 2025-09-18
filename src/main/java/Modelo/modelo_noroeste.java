/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author anyi4
 */

import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class modelo_noroeste {



    public String calcular(DefaultTableModel model, javax.swing.JTextArea areaResultados, javax.swing.JTextField txtRespuesta) {
        int numRows = model.getRowCount();
        int numCols = model.getColumnCount();

        areaResultados.setText("");
        txtRespuesta.setText("");

        int i = 0; 
        int j = 1; 
        int contadorAsignaciones = 0;
        int sumaTotal = 0;

        while (i < numRows - 1 && j < numCols - 1) {
            int oferta = Integer.parseInt(model.getValueAt(i, numCols - 1).toString());
            int demanda = Integer.parseInt(model.getValueAt(numRows - 1, j).toString());

            int asignacion = Math.min(oferta, demanda);
            contadorAsignaciones++;

            int costo = Integer.parseInt(model.getValueAt(i, j).toString());
            int resultado = asignacion * costo;

            areaResultados.append("S" + (i + 1) + " - D" + j + " -> " +
                    costo + " * " + asignacion + " = " + resultado + "\n");

            sumaTotal += resultado;

           
            model.setValueAt(oferta - asignacion, i, numCols - 1);
            model.setValueAt(demanda - asignacion, numRows - 1, j);

            if (oferta - asignacion == 0) {
                i++; 
            } else {
                j++; 
            }
        }

      
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setGroupingSeparator(',');
        DecimalFormat formato = new DecimalFormat("#,###", simbolos);
        txtRespuesta.setText("Q " + formato.format(sumaTotal));

        return "Método Esquina Noroeste terminado.";
    }


    
}
