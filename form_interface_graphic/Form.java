package form_interface_graphic;
import javax.swing.*;
public class Form extends JFrame {
    private JLabel name;
    Form(){
        setLayout(null);
        name = new JLabel("Hello World");
        name.setBounds(10, 20, 200, 300);
        add(name);
    }
    public static void main(String args[]) {
        Form formGraphic = new Form();
        formGraphic.setBounds(0, 0, 400, 300);
        formGraphic.setVisible(true);
        formGraphic.setLocationRelativeTo(null);
    }    
   
}
