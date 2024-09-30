import java.util.HashMap;

public class NovatechApp {
            public static void main(String[] args) {
                // Crear un HashMap para almacenar los usuarios y contraseñas
                HashMap<String, String> users = new HashMap<>();
                users.put("admin", "1234"); // Usuario por defecto

                // Iniciar la ventana de portada, pasando el mapa de usuarios
                Portada portada = new Portada();
                portada.setVisible(true);
            }
        }










