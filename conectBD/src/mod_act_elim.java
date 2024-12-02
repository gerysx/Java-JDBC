import java.sql.*;
import javax.swing.JOptionPane;
public class mod_act_elim {
    public static void main(String[] args) {
        // Pedir información al usuario con JOptionPane
        String dbName = JOptionPane.showInputDialog("Ingrese el nombre de la base de datos:");
        String port = JOptionPane.showInputDialog("Ingrese el puerto (ejemplo: 3306/ 3310):");
        String user = JOptionPane.showInputDialog("Ingrese el usuario:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña:");

        // Construir la URL de conexión con los datos ingresados
        String url = "jdbc:mysql://localhost:" + port + "/" + dbName;

        // Conectar a la base de datos
        try {
            Connection miConexion = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa!");
            // Aquí puedes realizar otras operaciones con la conexión

            Statement mi_statement=miConexion.createStatement();
            String consulta=JOptionPane.showInputDialog("Introduce su consulta");
            // Se pueden meter con el métido executeUpdate INSERT, UPDATE & DELETE
            mi_statement.executeUpdate(consulta);


        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        } 
            
        }
    }

