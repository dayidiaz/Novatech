import javax.swing.*;

public class AyudaSoporte extends JFrame {
        public AyudaSoporte() {
            setTitle("Ayuda y Soporte");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JTextArea helpText = new JTextArea();
            helpText.setText("Instrucciones sobre cómo jugar y usar la aplicación...");
            helpText.setEditable(false);
            panel.add(helpText);

            add(panel);
        }
    }


