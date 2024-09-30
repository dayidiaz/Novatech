import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private HashMap<String, String> users; // Mapa para almacenar los usuarios y contraseñas

    public Login(HashMap<String, String> users) { // Recibe el HashMap de usuarios
        this.users = users; // Asigna el mapa de usuarios
        setTitle("Novatech - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Etiquetas y campos de texto
        JLabel userLabel = new JLabel("Usuario:");
        userField = new JTextField();
        JLabel passLabel = new JLabel("Contraseña:");
        passField = new JPasswordField();

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);

        // Botones
        JButton loginButton = new JButton("Iniciar Sesión");
        JButton registerButton = new JButton("Registrar");
        panel.add(loginButton);
        panel.add(registerButton);

        // Acción para validar el login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String password = new String(passField.getPassword());

                // Validar si el usuario y la contraseña coinciden
                if (users.containsKey(user) && users.get(user).equals(password)) {
                    // Mostrar la ventana del dashboard
                    Dashboard dashboard = new Dashboard();
                    dashboard.setVisible(true);
                    dispose(); // Cerrar la ventana de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Acción para mostrar la ventana de registro
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro registro = new Registro(users); // Pasar el mapa de usuarios al registro
                registro.setVisible(true);
                dispose(); // Cerrar el login
            }
        });

        add(panel);
    }
}
