import javax.swing.*;
import java.awt.*;

    public class PerfilUsuario extends JFrame {
        private JTextField nameField;
        private JTextField emailField;
        private JButton saveButton;

        public PerfilUsuario() {
            setTitle("Perfil de Usuario");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2, 10, 10));

            // Campos para nombre y correo electrónico
            JLabel nameLabel = new JLabel("Nombre:");
            nameField = new JTextField();
            JLabel emailLabel = new JLabel("Correo Electrónico:");
            emailField = new JTextField();

            panel.add(nameLabel);
            panel.add(nameField);
            panel.add(emailLabel);
            panel.add(emailField);

            // Botón para guardar cambios
            saveButton = new JButton("Guardar");
            panel.add(saveButton);

            add(panel);
        }
    }


