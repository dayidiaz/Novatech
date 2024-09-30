import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Novatech - Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Dashboard", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Botón para acceder al juego de memoria
        JButton memoryGameButton = new JButton("Jugar Juego de Memoria");
        memoryGameButton.setFont(new Font("Helvetica", Font.PLAIN, 18));
        panel.add(memoryGameButton, BorderLayout.CENTER);

        // Acción para abrir el juego de memoria
        memoryGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JuegoMemoria juegoMemoria = new JuegoMemoria();
                juegoMemoria.setVisible(true);
                dispose(); // Cerrar el dashboard
            }
        });

        add(panel);
    }
}




