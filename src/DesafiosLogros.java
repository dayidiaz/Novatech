import javax.swing.*;

public class DesafiosLogros extends JFrame {
        public DesafiosLogros() {
            setTitle("Desafíos y Logros");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JTextArea challengesText = new JTextArea();
            challengesText.setText("Desafíos y logros desbloqueados...");
            challengesText.setEditable(false);
            panel.add(challengesText);

            add(panel);
        }
    }


