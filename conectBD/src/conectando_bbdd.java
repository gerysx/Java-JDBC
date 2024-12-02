import java.sql.*;
public class conectando_bbdd {
    public static void main(String[] args) throws Exception {

        try {

            Connection mi_conexion=DriverManager.getConnection("jdbc:mysql://localhost:3310/clientes_pedidos", "root", "");

            Statement mi_statment=mi_conexion.createStatement();

            ResultSet mi_resulset=mi_statment.executeQuery("SELECT * FROM usuarios");

            while (mi_resulset.next()){

                System.out.println(mi_resulset.getString(1) + " " + mi_resulset.getString(2)            
                + " " + mi_resulset.getString(3) + " " + mi_resulset.getString(4) 
                + " " + mi_resulset.getString(5));

            }
            
        } catch (Exception e) {
           System.out.println("¡NO CONECTA");
            e.printStackTrace();
        }
        
    }
}
