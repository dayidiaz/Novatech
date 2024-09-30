import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JuegoMemoria extends JFrame {
    private final int SIZE = 4; // Tamaño del tablero (4x4)
    private JButton[][] buttons;
    private List<Integer> values;
    private JButton firstButton, secondButton;
    private int firstIndex, secondIndex;
    private int matchesFound;

    public JuegoMemoria() {
        setTitle("Novatech - Juego de Memoria");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(SIZE, SIZE));
        buttons = new JButton[SIZE][SIZE];
        values = new ArrayList<>();

        // Crear valores para el juego (pares)
        for (int i = 0; i < (SIZE * SIZE) / 2; i++) {
            values.add(i);
            values.add(i);
        }
        Collections.shuffle(values); // Mezclar valores

        // Crear botones
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 24));
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setBackground(Color.LIGHT_GRAY);
                panel.add(buttons[i][j]);

                // Acción para los botones
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = (JButton) e.getSource();
                        handleButtonClick(clickedButton);
                    }
                });
            }
        }

        add(panel);
        firstButton = null;
        secondButton = null;
        matchesFound = 0;
    }

    private void handleButtonClick(JButton button) {
        // Verifica si el botón ya está en el proceso de emparejamiento
        if (button == firstButton || button.isEnabled() == false) {
            return;
        }

        // Muestra el valor del botón
        int index = getButtonIndex(button);
        button.setText(String.valueOf(values.get(index)));
        button.setEnabled(false);

        if (firstButton == null) {
            // Primer botón seleccionado
            firstButton = button;
            firstIndex = index;
        } else {
            // Segundo botón seleccionado
            secondButton = button;
            secondIndex = index;

            // Verifica si los valores coinciden
            if (values.get(firstIndex).equals(values.get(secondIndex))) {
                matchesFound++;
                if (matchesFound == (SIZE * SIZE) / 2) {
                    JOptionPane.showMessageDialog(this, "¡Ganaste!");
                    // Redirige a la pantalla de opciones
                    Opciones opciones = new Opciones();
                    opciones.setVisible(true);
                    dispose(); // Cierra la ventana del juego
                }
                firstButton = null;
                secondButton = null;
            } else {
                // Si no coinciden, oculta los botones después de un pequeño retraso
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstButton.setText("");
                        secondButton.setText("");
                        firstButton.setEnabled(true);
                        secondButton.setEnabled(true);
                        firstButton = null;
                        secondButton = null;
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }

    private int getButtonIndex(JButton button) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (buttons[i][j] == button) {
                    return i * SIZE + j;
                }
            }
        }
        return -1; // No encontrado
    }
}




