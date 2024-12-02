import java.sql.*;
public class conctandobd1 {
    public static void main(String[] args) throws Exception {

        try {
            // 1. CREAR CONEXION
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3310/clientes_pedidos", "root", "");
            
            // 2. CREAR OBJETO DE TIPO STATEMENT 
            Statement miStatement=miConexion.createStatement();

            //3. EJECUTAR    
            ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM clientes");

            //4. RECORRER EL RESULSET (TABLA VIRTUAL)
            while(miResultSet.next()){

                System.out.println(miResultSet.getString("EMPRESA") +  " " + miResultSet.getString("DIRECCIÓN"));
            }
        } catch (Exception e) {
            System.out.println("¡NO CONECTA");
            e.printStackTrace();

        }
    }
}
