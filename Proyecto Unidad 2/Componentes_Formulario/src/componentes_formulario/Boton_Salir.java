
package componentes_formulario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Boton_Salir extends JButton{
    
    public Boton_Salir(){
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Arial",Font.BOLD,16));
        this.setText("");
        ImageIcon imagen= new ImageIcon("C:\\Users\\CLAUDIA NAVARRETE\\Documents\\Tecnologico\\4to y 5to Semestre\\4 Topicos Avanzados\\Componentes_Formulario\\src\\componentes_formulario\\salir.png");
        this.setIcon(imagen);
    }
}
