package tareasis2;

import javax.swing.JFrame;

public class TareaSIS2 {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(new RegistroAlumnoSIS());
        ventana.setSize(1250,700);
        ventana.setVisible(true);
    }
    
}
