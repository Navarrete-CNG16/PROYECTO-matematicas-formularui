
package Funcion;
import javax.swing.table.DefaultTableModel;

// @author CLAUDIA NAVARRETE
 
public class Ordenar {
    public static void Orden(DefaultTableModel Vaor
    ) {
        int valor[] = new int[Vaor.getRowCount()];
        int fila = Vaor.getRowCount();
        String dato[] = new String[Vaor.getRowCount()];
        for (int i = 0; i < fila; i++) {
            valor[i] = Integer.parseInt((String) Vaor.getValueAt(i, 0));
        }
        for (int i = 0; i < valor.length - 1; i++) {
            for (int j = 0; j < valor.length - 1; j++) {
                if (valor[j] < valor[j + 1]) {
                    int tmp = valor[j + 1];
                    valor[j + 1] = valor[j];
                    valor[j] = tmp;
                }
            }
        }
        for (int i = 0; i < valor.length; i++) {
            dato[i] = valor[i] + "";
            Vaor.setValueAt(dato[i], i, 1);
        }
    }
}
