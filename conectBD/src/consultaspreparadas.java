import java.sql.*;
public class consultaspreparadas {
    public static void main(String[] args) {
        
        try {
            Connection mi_conexion=DriverManager.getConnection("jdbc:mysql://localhost:3310/compras", "root", "");
            PreparedStatement mi_statement=mi_conexion.prepareStatement("SELECT codp, dni, nombre, direccion, tlf, ciudad, pais FROM proveedores WHERE ciudad=? AND pais=?");
            mi_statement.setString(1, "Madrid");
            mi_statement.setString(2, "España");

            ResultSet rs=mi_statement.executeQuery();
            
            while (rs.next()){

                for (int i=1; i<=7; i++){
                System.out.print(rs.getString(i) + " ");
                }
            }
            
            //REUTILIZACIÓN DEL CODIGO SOLO CAMBIANDO LOS SETSTRING

    System.out.println("");
    System.out.println("SEGUNDA CONSULTA");

            mi_statement.setString(1, "Perth");
            mi_statement.setString(2, "Australia");

            rs=mi_statement.executeQuery();
            
            while (rs.next()){

                for (int i=1; i<=7; i++){
                System.out.print(rs.getString(i) + " ");
                }
            }


            rs.close();
            mi_conexion.close();
            mi_statement.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        } 
    }
}
