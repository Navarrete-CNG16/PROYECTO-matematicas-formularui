
package componentes_formulario;

import java.awt.Font;
import javax.swing.JLabel;

public class Etiqueta extends JLabel{
    
    public Etiqueta(){
        
        this.setFont(new Font("Century",Font.BOLD,18));
        this.setText("Titulo");
    }
}
