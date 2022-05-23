/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_formulario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonCalcular  extends JButton{
    
    public BotonCalcular(){
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Arial",Font.BOLD,16));
        this.setText("");
        ImageIcon imagen= new ImageIcon("C:\\Users\\CLAUDIA NAVARRETE\\Documents\\Tecnologico\\4to y 5to Semestre\\4 Topicos Avanzados\\Componentes_Formulario\\src\\componentes_formulario\\abaco.png");
        this.setIcon(imagen);
    }
}
