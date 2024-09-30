import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Registro extends JFrame {
    private JTextField userField;
    private JPasswordField passField, confirmPassField;
    private HashMap<String, String> users; // Mapa de usuarios

    public Registro(HashMap<String, String> users) { // Recibe el HashMap de usuarios
        this.users = users; // Asigna el mapa de usuarios
        setTitle("Novatech - Registro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Etiquetas y campos de texto
        JLabel userLabel = new JLabel("Usuario:");
        userField = new JTextField();
        JLabel passLabel = new JLabel("Contraseña:");
        passField = new JPasswordField();
        JLabel confirmPassLabel = new JLabel("Confirmar Contraseña:");
        confirmPassField = new JPasswordField();

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(confirmPassLabel);
        panel.add(confirmPassField);

        // Botón de registro
        JButton registerButton = new JButton("Registrar");
        panel.add(registerButton);

        // Acción para validar el registro
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String password = new String(passField.getPassword());
                String confirmPassword = new String(confirmPassField.getPassword());

                if (password.equals(confirmPassword)) {
                    if (!users.containsKey(user)) { // Verifica si el usuario no existe
                        users.put(user, password); // Agrega el nuevo usuario al mapa
                        JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
                        Login login = new Login(users); // Pasar el mapa de usuarios al login
                        login.setVisible(true);
                        dispose(); // Cerrar la ventana de registro
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
    }
}

