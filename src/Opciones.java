

    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Opciones extends JFrame {
        public Opciones() {
            setTitle("Opciones");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2, 10, 10));

            // Botón para acceder al perfil de usuario
            JButton perfilButton = new JButton("Perfil de Usuario");
            panel.add(perfilButton);

            // Botón para ver estadísticas de juego
            JButton estadisticasButton = new JButton("Estadísticas de Juego");
            panel.add(estadisticasButton);

            // Botón para ver notificaciones
            JButton notificacionesButton = new JButton("Notificaciones");
            panel.add(notificacionesButton);

            // Botón para ayuda y soporte
            JButton ayudaButton = new JButton("Ayuda y Soporte");
            panel.add(ayudaButton);

            // Botón para desafíos y logros
            JButton desafiosButton = new JButton("Desafíos y Logros");
            panel.add(desafiosButton);

            // Botón para personalización del juego
            JButton personalizacionButton = new JButton("Personalización");
            panel.add(personalizacionButton);

            // Acción para abrir cada opción
            perfilButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    PerfilUsuario perfilUsuario = new PerfilUsuario();
                    perfilUsuario.setVisible(true);
                }
            });

            estadisticasButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Aquí necesitarás pasar los datos reales de estadísticas
                    Estadisticas estadisticas = new Estadisticas(10, 5);
                    estadisticas.setVisible(true);
                }
            });

            notificacionesButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Notificaciones notificaciones = new Notificaciones("Tienes nuevas actualizaciones.");
                    notificaciones.setVisible(true);
                }
            });

            ayudaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AyudaSoporte ayudaSoporte = new AyudaSoporte();
                    ayudaSoporte.setVisible(true);
                }
            });

            desafiosButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DesafiosLogros desafiosLogros = new DesafiosLogros();
                    desafiosLogros.setVisible(true);
                }
            });

            personalizacionButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Personalizacion personalizacion = new Personalizacion();
                    personalizacion.setVisible(true);
                }
            });

            add(panel);
        }
    }


