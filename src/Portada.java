import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Portada extends JFrame {
    private JButton startButton;

    public Portada() {
        setTitle("Novatech - Portada");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel y configurarlo
        JPanel panel = new JPanel();
        panel.setBackground(new Color(232, 240, 254));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Título
        JLabel titleLabel = new JLabel("Novatech", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 36));
        titleLabel.setForeground(new Color(44, 62, 80));
        panel.add(titleLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio

        // Slogan
        JLabel sloganLabel = new JLabel("¡Tu mejor aliado para el aprendizaje!", SwingConstants.CENTER);
        sloganLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
        sloganLabel.setForeground(new Color(243, 156, 18));
        panel.add(sloganLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 40))); // Espacio

        // Botón "Empezar"
        startButton = new JButton("Empezar");
        startButton.setFont(new Font("Helvetica", Font.PLAIN, 14));
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(88, 214, 141));
        panel.add(startButton);

        // Acción para mostrar el login cuando se hace clic en el botón
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un HashMap para almacenar los usuarios y contraseñas
                HashMap<String, String> users = new HashMap<>();
                users.put("admin", "1234"); // Usuario por defecto

                Login login = new Login(users); // Pasar el mapa de usuarios al login
                login.setVisible(true);
                dispose(); // Cerrar la portada
            }
        });

        add(panel);
    }
}





