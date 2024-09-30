import javax.swing.*;

    public class Notificaciones extends JFrame {
        public Notificaciones(String mensaje) {
            setTitle("Notificación");
            setSize(300, 150);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            JLabel messageLabel = new JLabel(mensaje);
            panel.add(messageLabel);

            add(panel);
        }
    }

