import javax.swing.*;

    public class Estadisticas extends JFrame {
        private JLabel statsLabel;

        public Estadisticas(int juegosJugados, int victorias) {
            setTitle("Estadísticas de Juego");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            statsLabel = new JLabel("Juegos Jugados: " + juegosJugados + " | Victorias: " + victorias);
            panel.add(statsLabel);

            add(panel);
        }
    }


