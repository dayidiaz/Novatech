import javax.swing.*;
import java.awt.*;

public class Personalizacion extends JFrame {
        private JComboBox<String> themeComboBox;
        private JButton applyButton;

        public Personalizacion() {
            setTitle("Personalización");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 2, 10, 10));

            // Opciones de personalización
            JLabel themeLabel = new JLabel("Seleccionar Tema:");
            themeComboBox = new JComboBox<>(new String[]{"Tema Claro", "Tema Oscuro"});

            panel.add(themeLabel);
            panel.add(themeComboBox);

            // Botón para aplicar cambios
            applyButton = new JButton("Aplicar");
            panel.add(applyButton);

            add(panel);
        }
    }


